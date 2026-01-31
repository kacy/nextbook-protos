# nextbook-protos

Buf-based protobuf repository for Nextbook services. Stores `.proto` definitions and committed generated code for Go, TypeScript, Swift, and Kotlin.

## Prerequisites

- [Buf CLI](https://buf.build/docs/installation) (`brew install bufbuild/buf/buf`)
- [Go 1.23+](https://go.dev/dl/)
- [Node.js 20+](https://nodejs.org/) (for ts-proto plugin)

## Quick Start

```bash
# Install dependencies
npm install

# Lint protos
make lint

# Generate all code
make generate

# Run all checks
make check
```

## Adding a New Service

1. Create a new directory: `proto/<service>/v1/`
2. Add your `.proto` file(s) with `package whetherlabs.<service>.v1;`
3. Run `make generate` to produce generated code
4. Commit both the `.proto` and `gen/` changes

## Consumer Guides

### Go

```go
import helloworldv1 "github.com/kacy/whetherlabs/nextbook-protos/gen/go/whetherlabs/helloworld/v1"
```

Add to `go.mod`:
```
require github.com/kacy/whetherlabs/nextbook-protos/gen/go v0.0.0
```

### TypeScript

Install via git:
```bash
npm install github:whetherlabs/nextbook-protos#main
```

Import:
```typescript
import { HelloWorldServiceClient } from "@whetherlabs/nextbook-protos/helloworld/v1/helloworld";
```

### Swift (iOS / SPM)

In Xcode: **File > Add Package Dependencies** and enter:
```
https://github.com/kacy/whetherlabs/nextbook-protos.git
```

Then import:
```swift
import WhetherlabsProtos
```

### Kotlin

Generated files are in `gen/kotlin/`. Distribution mechanism TBD — for now, copy or reference directly.

## Versioning

Services use package-level versioning (`v1`, `v2`, etc.). The repository itself is tagged for release when consumers need a stable reference point.

## CI

- **PR checks** (`buf-ci.yaml`): lint, breaking change detection, format check, and generation verification
- **Auto-generate** (`buf-generate.yaml`): regenerates and commits code on push to main

## Makefile Targets

| Target | Description |
|--------|-------------|
| `make generate` | Install deps + generate all code |
| `make lint` | Lint proto files |
| `make format` | Auto-format proto files |
| `make breaking` | Check for breaking changes vs main |
| `make check` | Run lint + format-check + breaking |
| `make clean` | Remove generated files (preserves go.mod, package.json) |
| `make regen` | Clean + generate |
| `make deps` | Update buf dependencies |
| `make install` | Install buf CLI via Homebrew |

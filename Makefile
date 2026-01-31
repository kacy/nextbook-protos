.PHONY: generate lint format format-check breaking clean check deps regen install

generate:
	npm install
	buf generate
	cd gen/go && go mod tidy

lint:
	buf lint

format:
	buf format -w

format-check:
	buf format --diff --exit-code

breaking:
	buf breaking --against '.git#branch=main'

clean:
	find gen/go -type f -name '*.go' -delete
	find gen/ts -type f \( -name '*.ts' -o -name '*.js' \) ! -name 'package.json' -delete
	find gen/swift/Sources/WhetherlabsProtos -type f -name '*.swift' -delete 2>/dev/null || true
	find gen/kotlin -type f \( -name '*.java' -o -name '*.kt' \) -delete 2>/dev/null || true

check: lint format-check breaking

deps:
	buf dep update

regen: clean generate

install:
	brew install bufbuild/buf/buf

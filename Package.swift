// swift-tools-version: 5.9

import PackageDescription

let package = Package(
    name: "WhetherlabsProtos",
    platforms: [
        .iOS(.v16),
        .macOS(.v13),
    ],
    products: [
        .library(
            name: "WhetherlabsProtos",
            targets: ["WhetherlabsProtos"]
        ),
    ],
    dependencies: [
        .package(url: "https://github.com/apple/swift-protobuf.git", from: "1.28.1"),
        .package(url: "https://github.com/grpc/grpc-swift.git", from: "1.24.0"),
    ],
    targets: [
        .target(
            name: "WhetherlabsProtos",
            dependencies: [
                .product(name: "SwiftProtobuf", package: "swift-protobuf"),
                .product(name: "GRPC", package: "grpc-swift"),
            ],
            path: "gen/swift/Sources/WhetherlabsProtos"
        ),
    ]
)

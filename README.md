# swagger-schema-registry-service

## Overview
This is the sample service that is used in Using Swagger and OpenAPI in vRealize Orchestrator HTTP REST Plug-in blogpost.

### Prerequisites

* Java 11
* Maven 3.8+

### Build & Run

1. mvn clean install -DskipTests
2. ./mvnw spring-boot:run

## Documentation
This server exposes 3 endpoints which return
OpenAPI host schema, Swagger v2 and OpenAPI v3 Petstore schemas.

```
http://{server.ip}:8080/host-spec
```

```
http://{server.ip}:8080/v2/petstore
```

```
http://{server.ip}:8080/v3/petstore
```

## Contributing

The swagger-schema-registry-service project team welcomes contributions from the community. Before you start working with swagger-schema-registry-service, please
read our [Developer Certificate of Origin](https://cla.vmware.com/dco). All contributions to this repository must be
signed as described on that page. Your signature certifies that you wrote the patch or have the right to pass it on
as an open-source patch. For more detailed information, refer to [CONTRIBUTING.md](CONTRIBUTING.md).

## License

Apache License 2.0
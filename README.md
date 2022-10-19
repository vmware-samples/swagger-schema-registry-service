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

The swagger-schema-registry-service project team welcomes contributions from the community. Before you start working with this project please read and sign our Contributor License Agreement (https://cla.vmware.com/cla/1/preview). If you wish to contribute code and you have not signed our Contributor Licence Agreement (CLA), our bot will prompt you to do so when you open a Pull Request. For any questions about the CLA process, please refer to our [FAQ](https://cla.vmware.com/faq).

## License

Apache License 2.0
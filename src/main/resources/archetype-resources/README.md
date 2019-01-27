# camel-swagger-rest-dsl-generator

Replace the swagger.json file in src/main/resources directory with your own OpenAPI specification
and run the Maven compile command to generate Camel REST DSL and data models

```
$ mvn clean compile
```
new resources are generated in swagger.api and swagger.model packeges

```
$ mvn spring-boot:run
```

Testing the project

To pull up the Swagger/OpenAPI spec:

```
$ curl -X GET -H 'Accept: application/json' 'http://localhost:8080/api/api-doc'
```


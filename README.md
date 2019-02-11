# camel-swagger-rest-dsl-generator

Use this project to create an archetype within your IDE. 


By running the following command:

```
$ mvn clean install
```

Now create a new project, using the created archetype*. 
1. Create New Project and select Maven. 
2. Select Create from archetype. 
3. Select the created archetype
4. Fill in your own GroupId and ArtifactId 

Now you have created an Java Springboot Project using Camel and Swagger.

* if the archetype is not available you need to update your Maven repository manually; navigate to - Settings > Build, Execution, Deployment > Build Tools > Maven > Repositories and click 'update'.

Now it's time to make use of the this project.

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

To see the SwaggerUI navigate to:

```
$ http://localhost:8080
```

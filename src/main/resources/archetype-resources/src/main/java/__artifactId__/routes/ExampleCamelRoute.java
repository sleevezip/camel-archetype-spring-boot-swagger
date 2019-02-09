package ${groupId}.${artifactId}.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ExampleCamelRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("direct:get-workflow").routeId("find-route")
                .setBody().simple("{ \"id\": ${header.id} }")
                .log("query: ${body}")
                .to("mongodb3:mongo?database=workflow-engine&collection=workflows&operation=findAll")
                .log("findOneByQuery result: ${body}")
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(200))
                .end();

    }
}

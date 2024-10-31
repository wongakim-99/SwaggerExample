package org.zeorck.swaggertest.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class SwaggerConfig {
    private final String devUrl;
    private final String prodUrl;

    public SwaggerConfig( @Value("${swaggertest.openapi.dev-url}") final String devUrl,
                          @Value("${swaggertest.openapi.prod-url}") final String prodUrl
    ) {
        this.devUrl = devUrl;
        this.prodUrl = prodUrl;
    }

    @Bean
    public OpenAPI openAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Development Server");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Production Server");

        final Info info = new Info()
                .title("API Documentation")
                .version("v1.0.0")
                .description("스웨거 테스트 API");

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer, prodServer));
    }
}

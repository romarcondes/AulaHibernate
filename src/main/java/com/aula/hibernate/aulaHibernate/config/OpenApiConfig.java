package com.aula.hibernate.aulaHibernate.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("API Documentation")
                    .version("1.0")
                    .description("API documentation for the application")
                    .contact(new Contact().name("Rafael Marcondes").email("rafaelmarcodeoliveira@gmail.com"))
                    .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}

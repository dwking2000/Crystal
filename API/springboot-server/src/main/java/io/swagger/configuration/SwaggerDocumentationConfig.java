package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@Configuration
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Crystal Server API")
            .description("This is a simple Crystal server API. You can find out more about Crystal at <a href='http://getcrystal.net'>http://getcrystal.net</a>  For this sample, you can use the api key 'get-crystal' for tests that need authorization (authorization filters)")
            .license("MIT")
            .licenseUrl("http://github.com/gruntjs/grunt/blob/master/LICENSE-MIT")
            .termsOfServiceUrl("")
            .version("")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
					.build()
				.apiInfo(apiInfo());
    }

}

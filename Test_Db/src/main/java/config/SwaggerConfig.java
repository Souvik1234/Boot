package config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import com.example.demo.Control;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@ComponentScan(basePackageClasses = Control.class)
@Configuration

public class SwaggerConfig {

	private static final String SWAGGER_API_VERSION="1.0";
	private static final String LICENSE_TEXT="Licese";
	private static final String title="Product REST API";
	private static final String description="RESTFul API for Products";
	
	private ApiInfo apiInfo() { /*It is not mandatory*/
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.license(LICENSE_TEXT)
				.version(SWAGGER_API_VERSION)
				.build();
				
	}
	
	@Bean
	public Docket productApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo()) //It is not mandatory
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")) 
				.paths(PathSelectors.any())
				.build();
	}
}

package rest_api_Converter.rest_api_Converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationProperties(prefix = "rest")
@ConfigurationPropertiesScan
public class RestApiConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiConverterApplication.class, args);
	}

}

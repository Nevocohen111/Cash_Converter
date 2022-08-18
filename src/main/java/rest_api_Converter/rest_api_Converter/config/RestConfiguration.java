package rest_api_Converter.rest_api_Converter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest")
@Data
public class RestConfiguration {
    private String username;
    private String password;
    private String baseUrl;
    private String exchange;

}

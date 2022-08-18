package rest_api_Converter.rest_api_Converter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CustomHttpResponse {
    int statusCode;
    String message;
}

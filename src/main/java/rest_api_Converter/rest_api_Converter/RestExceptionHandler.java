package rest_api_Converter.rest_api_Converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import rest_api_Converter.rest_api_Converter.model.CustomHttpResponse;

@Slf4j
@RestControllerAdvice(annotations = RestController.class)
@Order(1)
public class RestExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomHttpResponse> exceptionHandler(Exception e) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new CustomHttpResponse(500,e.getMessage()));

    }

}


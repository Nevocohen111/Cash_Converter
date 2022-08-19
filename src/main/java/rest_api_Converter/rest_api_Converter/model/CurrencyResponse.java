package rest_api_Converter.rest_api_Converter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CurrencyResponse {
    private float result;

    public CurrencyResponse(float result) {
        this.result = result;
    }
}

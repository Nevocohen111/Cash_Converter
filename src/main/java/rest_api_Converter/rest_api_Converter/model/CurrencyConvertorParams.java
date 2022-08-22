package rest_api_Converter.rest_api_Converter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConvertorParams {
    String from;
    String to;
    double amount;
}

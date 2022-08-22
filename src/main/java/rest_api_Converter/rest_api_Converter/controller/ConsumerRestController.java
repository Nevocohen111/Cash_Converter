package rest_api_Converter.rest_api_Converter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest_api_Converter.rest_api_Converter.model.CurrencyConvertorParams;
import rest_api_Converter.rest_api_Converter.model.CurrencyResponse;
import rest_api_Converter.rest_api_Converter.service.CurrencyConvertorService;

@RestController
@RequestMapping("/api/currency")
public class ConsumerRestController {
    @Autowired
    private CurrencyConvertorService currencyConvertorService;

    @PostMapping("/convert")
    public CurrencyResponse convertCash(@RequestBody CurrencyConvertorParams params) {
        return currencyConvertorService.convert(params);
    }


}

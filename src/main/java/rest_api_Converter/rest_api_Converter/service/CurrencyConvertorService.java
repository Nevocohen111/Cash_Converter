package rest_api_Converter.rest_api_Converter.service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import rest_api_Converter.rest_api_Converter.config.RestConfiguration;
import rest_api_Converter.rest_api_Converter.model.CurrencyConvertorParams;
import rest_api_Converter.rest_api_Converter.model.CurrencyResponse;

@Service
public class CurrencyConvertorService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private RestConfiguration restConfiguration;


    public CurrencyResponse convert(CurrencyConvertorParams params) {

        String response = webClient.method(HttpMethod.GET)
                .uri(restConfiguration.getBaseUrl() +  '?' + "from=" + params.getFrom() + '&' + "to=" + params.getTo() + '&' + "amount=" + params.getAmount())
                .retrieve()
                .bodyToMono(String.class).block();

        JsonObject jsonObject = new Gson().fromJson(response, JsonObject.class);
        JsonElement result = jsonObject.get("result");

        return new CurrencyResponse(result.getAsFloat());
    }
}

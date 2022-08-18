package rest_api_Converter.rest_api_Converter.service;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import rest_api_Converter.rest_api_Converter.config.RestConfiguration;
import rest_api_Converter.rest_api_Converter.model.Converter;
import rest_api_Converter.rest_api_Converter.model.CustomHttpResponse;
import rest_api_Converter.rest_api_Converter.model.Result;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerRestService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private RestConfiguration restConfiguration;




    public String displayIlsCurrency(Converter converter) {
        String response = webClient.method(HttpMethod.GET)
                .uri(restConfiguration.getBaseUrl() +  '?' + "from=" + converter.getFrom() + '&' + "to=" + converter.getTo() + '&' + "amount=" + converter.getAmount())
                .retrieve()
                .bodyToMono(String.class).block();
        //extract the result key and value pair from the response
        String result = "{" + "\n" + " " + '"' + response.substring(response.indexOf("result"), response.indexOf("result") + 16) + "\n" + "}" ;
        return result;

    }



}

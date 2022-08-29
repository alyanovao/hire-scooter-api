package ru.aao.hirescooterservice.service;

import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import ru.aao.hirescooterservice.dto.PriceDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@ConditionalOnProperty(name = "clientType", matchIfMissing = true, havingValue = "default")
public class PriceServiceRestTemplate implements PriceService {

    @Value("${clientUrl}")
    private String url;

    private RestOperations restTemplate = new RestTemplate();

    @Override
    public List<PriceDto> getPrice() {

        Map<String, String> urlPathVariables = new HashMap<>();

        ResponseEntity<PriceDto[]> response = restTemplate.getForEntity(url + "/api/prices", PriceDto[].class, urlPathVariables);
        val res = Arrays.stream(response.getBody()).toList();
        return res;
    }
}





package com.finplat.finplat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    public String getDataFromApi() {
        String url = "https://api.binance.com/api/v3/exchangeInfo?symbol=BTCUSDT";
        return restTemplate.getForObject(url, String.class);
    }
}

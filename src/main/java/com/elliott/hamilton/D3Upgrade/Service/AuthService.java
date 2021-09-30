package com.elliott.hamilton.D3Upgrade.Service;

import com.elliott.hamilton.D3Upgrade.Model.BlizzardAccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService {

    @Value("${D3_CLIENT_ID}")
    private String clientId;

    @Value("${D3_CLIENT_SECRET}")
    private String clientSecret;

    public BlizzardAccessToken getAccessToken() {
        RestTemplate restTemplate = new RestTemplate();
        String authEndpoint = "https://us.battle.net/oauth/token";

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("client_id", clientId);
        body.add("client_secret", clientSecret);
        body.add("grant_type", "client_credentials");

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, getHeaders());
        System.out.println(restTemplate.postForObject(authEndpoint, requestEntity, BlizzardAccessToken.class));
        return restTemplate.postForObject(authEndpoint, requestEntity, BlizzardAccessToken.class);
    }

    private HttpHeaders getHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/x-www-form-urlencoded");
        return httpHeaders;
    }
}


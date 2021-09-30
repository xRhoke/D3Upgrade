package com.elliott.hamilton.D3Upgrade.Service;

import com.elliott.hamilton.D3Upgrade.Model.BlizzardAccessToken;
import com.elliott.hamilton.D3Upgrade.Model.D3Profile;
import com.elliott.hamilton.D3Upgrade.Model.EquipmentSet;
import com.elliott.hamilton.D3Upgrade.Model.Hero;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class D3Service {

    private final RestTemplate restTemplate = new RestTemplate();

    public D3Profile getD3Profile(String battleTag, BlizzardAccessToken accessToken) {
        return this.restTemplate.exchange(
                String.format("https://us.api.blizzard.com/d3/profile/%s/", battleTag),
                HttpMethod.GET,
                buildHttpEntityWithAuthHeader(accessToken),
                D3Profile.class).getBody();
    }

    public Hero getHero(String battleTag, Long heroID, BlizzardAccessToken accessToken) {
        return this.restTemplate.exchange(
                String.format("https://us.api.blizzard.com/d3/profile/%s/hero/%s", battleTag, heroID),
                HttpMethod.GET,
                buildHttpEntityWithAuthHeader(accessToken),
                Hero.class).getBody();
    }

    public EquipmentSet getHeroItems(String battleTag, Long heroID, BlizzardAccessToken accessToken) {
        return this.restTemplate.exchange(
                String.format("https://us.api.blizzard.com/d3/profile/%s/hero/%s/items", battleTag, heroID),
                HttpMethod.GET,
                buildHttpEntityWithAuthHeader(accessToken),
                EquipmentSet.class).getBody();
    }

    private HttpEntity<String> buildHttpEntityWithAuthHeader(BlizzardAccessToken accessToken){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", String.format("Bearer %s", accessToken.getAccessToken()));
        System.out.println(headers);

        return new HttpEntity<>(null, headers);
    }


}

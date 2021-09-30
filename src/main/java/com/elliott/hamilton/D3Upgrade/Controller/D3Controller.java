package com.elliott.hamilton.D3Upgrade.Controller;

import com.elliott.hamilton.D3Upgrade.Model.BlizzardAccessToken;
import com.elliott.hamilton.D3Upgrade.Model.D3Profile;
import com.elliott.hamilton.D3Upgrade.Model.EquipmentSet;
import com.elliott.hamilton.D3Upgrade.Model.Hero;
import com.elliott.hamilton.D3Upgrade.Service.AuthService;
import com.elliott.hamilton.D3Upgrade.Service.D3Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/d3")
public class D3Controller {

    private D3Service d3Service;
    private AuthService authService;

    private LocalDateTime tokenExpire;
    private BlizzardAccessToken accessToken;

    public D3Controller(D3Service d3Service, AuthService authService) {
        this.d3Service = d3Service;
        this.authService = authService;
        reAuthenticate();
    }

    @GetMapping("/profile/{battleTag}")
    public D3Profile getD3Profile(@PathVariable String battleTag){
        validateAccessToken();
        return this.d3Service.getD3Profile(battleTag, this.accessToken);
    }

    @GetMapping("/profile/{battleTag}/hero/{heroID}")
    public Hero getHero(@PathVariable String battleTag, @PathVariable Long heroID){
        validateAccessToken();
        return this.d3Service.getHero(battleTag, heroID, this.accessToken);
    }

    @GetMapping("/profile/{battleTag}/hero/{heroID}/items")
    public EquipmentSet getHeroItems(@PathVariable String battleTag, @PathVariable Long heroID){
        validateAccessToken();
        return this.d3Service.getHeroItems(battleTag, heroID, this.accessToken);
    }

    private void validateAccessToken() {
        if (LocalDateTime.now().isAfter(this.tokenExpire)) {
            reAuthenticate();
        }
    }

    private void reAuthenticate() {
        this.accessToken = this.authService.getAccessToken();
        this.tokenExpire = LocalDateTime.now().plusSeconds(this.accessToken.getExpiresIn());
    }
}

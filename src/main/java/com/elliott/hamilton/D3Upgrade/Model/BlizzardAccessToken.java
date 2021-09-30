package com.elliott.hamilton.D3Upgrade.Model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BlizzardAccessToken {

    private String accessToken;
    private String tokenType;
    private Long expiresIn;

    @Override
    public String toString() {
        return "BlizzardAccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }

    @JsonGetter(value = "accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonSetter(value = "access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonGetter(value = "tokenType")
    public String getTokenType() {
        return tokenType;
    }

    @JsonSetter(value = "token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @JsonGetter(value = "expiresIn")
    public Long getExpiresIn() {
        return expiresIn;
    }

    @JsonSetter(value = "expires_in")
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}

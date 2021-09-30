package com.elliott.hamilton.D3Upgrade.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Gem {

    private SocketItemDescription item;
    private String[] attributes;

    private boolean isGem;
    private boolean isJewel;

    public SocketItemDescription getItem() {
        return item;
    }

    public void setItem(SocketItemDescription item) {
        this.item = item;
    }

    public String[] getAttributes() {
        return attributes;
    }

    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
    }

    public boolean isGem() {
        return isGem;
    }

    @JsonSetter(value = "isGem")
    public void setGem(boolean gem) {
        isGem = gem;
    }

    public boolean isJewel() {
        return isJewel;
    }

    @JsonSetter(value = "isJewel")
    public void setJewel(boolean jewel) {
        isJewel = jewel;
    }
}

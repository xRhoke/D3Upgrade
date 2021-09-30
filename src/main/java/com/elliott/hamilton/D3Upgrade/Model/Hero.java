package com.elliott.hamilton.D3Upgrade.Model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Hero {
    private Long id;
    private String name;
    private String d3Class;
    private int level;
    private boolean seasonal;
    private EquipmentSet items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter(value = "class")
    public String getD3Class() {
        return d3Class;
    }

    @JsonSetter(value = "class")
    public void setD3Class(String d3Class) {
        this.d3Class = d3Class;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        this.seasonal = seasonal;
    }

    public EquipmentSet getItems() {
        return items;
    }

    public void setItems(EquipmentSet items) {
        this.items = items;
    }
}

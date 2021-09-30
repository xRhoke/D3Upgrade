package com.elliott.hamilton.D3Upgrade.Model;

public class GearPiece {
    private String id;
    private String name;
    private Attributes attributes;
    private int openSockets;
    private Gem[] gems;
    private Type type;
    private String typeName;
    private String displayColor;
    private String icon;
    private String tooltipParams;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public int getOpenSockets() {
        return openSockets;
    }

    public void setOpenSockets(int openSockets) {
        this.openSockets = openSockets;
    }

    public Gem[] getGems() {
        return gems;
    }

    public void setGems(Gem[] gems) {
        this.gems = gems;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(String tooltipParams) {
        this.tooltipParams = tooltipParams;
    }
}

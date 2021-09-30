package com.elliott.hamilton.D3Upgrade.Model;

public class D3Profile {

    private String battleTag;
    private Hero[] heroes;

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero[] heroes) {
        this.heroes = heroes;
    }
}

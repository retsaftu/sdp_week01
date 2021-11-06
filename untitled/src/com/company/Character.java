package com.company;

public abstract class Character{

    private WeaponBehavior weapon;
    private String name;

    public Character(String name){
        this.name = name;
    }

    public Character(String name, WeaponBehavior weapon){
        this(name);
        this.weapon = weapon;
    }

    public String name(){ return name; }
    public WeaponBehavior weapon(){ return weapon; }
    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    public abstract void fight(Character opponent);
}


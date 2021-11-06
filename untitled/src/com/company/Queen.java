package com.company;

public class Queen extends Character{
    public Queen(String name){ super(name); }
    public Queen(String name, WeaponBehavior weapon){ super(name, weapon); }

    @Override
    public void fight(Character opponent) {
        if(weapon().useWeapon()>opponent.weapon().useWeapon()){
            System.out.println(name()+" Win, "+opponent.name()+"Lose");
        }else if(weapon().useWeapon()==opponent.weapon().useWeapon()){
            System.out.println("Draw");
        }else {
            System.out.println(opponent.name()+" Win, "+name()+"Lose");
        }
    }
}

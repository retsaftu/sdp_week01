package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Troll troll = new Troll("Durotan",new Axe());
        King king = new King("Arthas",new Bow());
        Knight knight = new Knight("Jon Snow",new Sword());
        Queen queen = new Queen("Elizabeth 2",new Knife());
        king.fight(troll);
        queen.fight(knight);
        king.setWeapon(new Sword());
        king.fight(knight);
    }
}

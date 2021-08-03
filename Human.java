package com.objectmaster;

public class Human {
	int strength;
	int stealth;
	int intelligence;
	int health;
	
	
	public Human() {
		this(3,3,3,100);
	}
	
	public Human(int Strengthparam,int stealthparam,
				int intelligenceparam,int healthparam) {
		strength = Strengthparam;
		stealth = stealthparam;
		intelligence = intelligenceparam;
		health = healthparam;
	}
	
	protected void attack(Human person) {
		person.health -= this.strength;
		System.out.println("*Stab*");
		System.out.println(person.health);
	}
}

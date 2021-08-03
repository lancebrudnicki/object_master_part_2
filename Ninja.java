package com.objectmaster;

class Ninja extends Human {

	public Ninja() {
		stealth = 10;
	}
	
	protected void steal(Human person) {
		int steal = this.stealth;
		this.health += steal;
		System.out.println("You figured out to steal people's health.......you gained " + steal + "health");
	}
	protected void runAway() {
		this.health -= 10;
		System.out.println("you ran away.....");
	}
	
}

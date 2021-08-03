package com.objectmaster;

class Wizard extends Human {

	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	protected void heal(Human person) {
		person.health += this.intelligence;
		System.out.println("Your target was healed for " + this.intelligence + "health");
	}
	protected void fireball(Human person) {
		
		int damage = (this.intelligence * 3);
		person.health -= damage;
		System.out.println("Your target lost " + damage +" health" );
	}

}

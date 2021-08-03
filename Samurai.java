package com.objectmaster;

class Samurai extends Human {	
	private static int count =0;
	
	public Samurai() {
		health = 200;
		count++;
	}
	protected void deathblow(Human person) {
		person.health = 0;
		this.health = this.health/2;
		System.out.println("You Killed that person......");
		System.out.println(person + " is dead " + person.health);
	}
	protected void meditate() {
		this.health += this.health/2;
		System.out.println("You think about the crimes you have done");
	}
	public static int howMany() {
		return count;
	}

}

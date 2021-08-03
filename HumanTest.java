package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		wizard.fireball(samurai);
		ninja.steal(samurai);
		samurai.deathblow(ninja);
	}

}

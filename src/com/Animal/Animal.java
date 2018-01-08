package com.Animal;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	public abstract void eat();
	public void walk(Animal a) {
		System.out.println("这是个"+a.legs+"条腿走路的动物");
	}
}

package com.Animal;

import Interface.pet;

public class Cat extends Animal implements pet{
	public String name;
	protected Cat(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}
	public Cat(String name)
	{
		super(4);
		this.name =name;
	}
	public Cat()
	{
		this("");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("√®≥‘¡À");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("√®‘⁄ÕÊ");
	}

}

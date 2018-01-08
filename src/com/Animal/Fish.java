package com.Animal;

import Interface.pet;

public class Fish extends Animal implements pet{
	private String name;
	protected Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	public void walk(Fish a)
	{
		System.out.println("这是鱼没有腿");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

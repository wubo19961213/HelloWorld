package com.Demo_1;

public class Hero {
	public String name;
	float hp;
	float armor;
	int moveSpeed;
	public void legendary()
	{
		System.out.println("Œ““—≥¨…Ò£°");
	}
	public float getHp()
	{
		return this.hp;
	}
	public void recovery(float armor)
	{
		this.armor +=armor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		h.armor = 32;
		h.hp	= 23;
		h.recovery(21);
		System.out.println(h.armor+","+h.getHp());
		h.legendary();
	}

}

package com.Demo_1;

public class Item {
	private String name;
	private int price;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPrice() 
	{
		return this.price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i_1 = new Item();
		i_1.setName("Ѫƿ");
		i_1.setPrice(50);
	}

}

package property;

import arrayList.HeroNItem;

public abstract class Item extends HeroNItem{
	private String name;
	private int price;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public String toString(Item i) {
		return i.name+","+i.price;
	}
	public void finalize()
	{
		System.out.println("当前对象正在被回收");
	}
	public boolean equals(Object o)
	{
		if(o instanceof Item)
		{
			Item h=(Item) o;
			return h.price == this.price;
		}
		return false;
	}
	/*private Item() {};
	private static Item i;
	public static Item getItem()
	{
		if(null == i)
		{
			i = new Item();
		}
		return i;
	}*/
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
	public abstract boolean disposable();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i_1 = new Item()
		{
			@Override
			public boolean disposable() {
				// TODO Auto-generated method stub
				return false;
			};
		};
		i_1.setName("血瓶");
		i_1.setPrice(50);
	}

}

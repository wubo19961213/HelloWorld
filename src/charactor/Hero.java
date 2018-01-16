package charactor;

import Interface.Mortal;
import arrayList.HeroNItem;

public class Hero extends HeroNItem{
	public String name;
	float hp;
	float armor;
	int moveSpeed;
	static String copyright;
	/*private Hero() {};
	private static Hero h = new Hero();
	public static Hero getHero()
	{
		return h;
	}*/
	public String toString()
	{
		return this.name;
	}
	public Hero(String name){
		  this.name = name;
	}
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
	public void revive(Hero h)
	{
		h = new Hero("");
		h.hp = 300;
	}
	public void kill(Mortal i)
	{
		i.die();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero("");
		h.armor = 32;
		h.hp	= 23;
		h.recovery(21);
		h.revive(h);
		ADHero a =new ADHero();
		System.out.println(h.armor+","+h.getHp());
		h.legendary();
		h.kill(a);
	}

}

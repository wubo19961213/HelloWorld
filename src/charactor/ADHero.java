package charactor;

import Interface.Mortal;

public class ADHero extends Hero implements Mortal{

	public void attack() 
	{
		System.out.println(name);
	}
	public void attack(Hero ...heros)
	{
		for(int i=0;i<heros.length;i++)
		{
			System.out.println(name + "¹¥»÷ÁË" + heros[i].name);
		}
	}
	public void heal()
	{
	}
	public void heal(Hero h,int hp)
	{
		h.hp += hp;
		System.out.println(h.name + "»Ö¸´ÑªÁ¿" + hp);
	}
	public ADHero(String _name,float _armor)
	{
		super(_name);
		this.armor 	= _armor;
	}
	public ADHero(String _name,float _armor,float _hp,int _moveSpeed)
	{
		this(_name,_armor);
		this.hp		= _hp;
		this.moveSpeed	= _moveSpeed;
	}
	public ADHero() {
		super("");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADHero a = new ADHero();
		ADHero.copyright = "Blizzard Entertainment Enterprise";
		a.name = "AÓ¢ÐÛ";
		Hero b = new Hero("");
		b.name = "BÓ¢ÐÛ";
		ADHero c = new ADHero("CÓ¢ÐÛ",1,23,200);
		a.attack();
		a.attack(b,c);
		System.out.println(c.armor + "/" + c.copyright);
		a.heal(c, 23);
	}
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("·²ÈËÖÕÓÐÒ»ËÀ£¡");
	}

}

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
			System.out.println(name + "������" + heros[i].name);
		}
	}
	public void heal()
	{
	}
	public void heal(Hero h,int hp)
	{
		h.hp += hp;
		System.out.println(h.name + "�ָ�Ѫ��" + hp);
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
		a.name = "AӢ��";
		Hero b = new Hero("");
		b.name = "BӢ��";
		ADHero c = new ADHero("CӢ��",1,23,200);
		a.attack();
		a.attack(b,c);
		System.out.println(c.armor + "/" + c.copyright);
		a.heal(c, 23);
	}
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("��������һ����");
	}

}

package charactor;

import Interface.Mortal;
import arrayList.HeroNItem;

public class Hero extends HeroNItem{
	public String name;
	public float hp;
	float armor;
	int moveSpeed;
	static String copyright;
	public int damage;
	public void attackHero(Hero h)
	{
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s ���ڹ��� %s,%s ��Ѫ����� %.0f %n",name,h.name,h.name,h.hp);
		if(h.isDead())
		{
			System.out.println(h.name+"���ˣ�");
		}
	}
	public void podon(int i)
	{
		System.out.println("����ȭ��"+i+"����");
	}
	public boolean isDead()
	{
		return 0>=hp?true:false;
	}
	public String toString()
	{
		return this.name;
	}
	public Hero(String name){
		  this.name = name;
	}
	public void legendary()
	{
		System.out.println("���ѳ���");
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

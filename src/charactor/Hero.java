package charactor;

public class Hero {
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
		h = new Hero();
		h.hp = 300;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		h.armor = 32;
		h.hp	= 23;
		h.recovery(21);
		h.revive(h);
		System.out.println(h.armor+","+h.getHp());
		h.legendary();
	}

}

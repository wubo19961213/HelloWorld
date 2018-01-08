package charactor;

import Interface.Healer;

public class Support extends Hero implements Healer{

	public Support(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Support s = new Support("");
		s.armor = 23;
		s.heal();
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("Ó¢ÐÛ»ØÑª£¡");
	}

}

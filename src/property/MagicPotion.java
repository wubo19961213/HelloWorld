package property;

public class MagicPotion extends Item {
	public void effect()
	{
		System.out.println("蓝瓶使用后，可以回魔法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return true;
	}

}

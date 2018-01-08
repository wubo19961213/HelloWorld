package property;

public class LifePotion extends Item {

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		System.out.println("消耗了一瓶药水");
		return false;
	}

}

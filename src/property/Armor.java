package property;

public class Armor extends Item{
	public Armor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int ac;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armor a = new Armor();
		a.setPrice(300);
		a.ac = 15;
		System.out.println(a.toString());
	}
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		System.out.println("ËðºÄÁË");
		return true;
	}

}

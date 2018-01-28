package multiplethread;

import charactor.Hero;

public class Battle implements Runnable{
	private Hero h1;
	private Hero h2;
	public Battle(Hero h1,Hero h2)
	{
		this.h1 = h1;
		this.h2 = h2;
	}
	public void run()
	{
		/*while(!h2.isDead())
		{
			h1.attackHero(h2);
		}*/
		int i = 1;
		while(i>0)
		{
			while(i<=3){
				h1.podon(i);
				i++;
			};
			i = 1;
			try {
				System.out.println("³äÄÜ5Ãë");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		h1.podon(i);
	}

}

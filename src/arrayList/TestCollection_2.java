package arrayList;

import java.util.ArrayList;
import java.util.HashMap;

import charactor.Hero;

public class TestCollection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime,endTime;
		int number = 0;
		startTime = System.nanoTime();
		/*ArrayList<Hero> Heros = new ArrayList<>();
		for(int i = 0;i < 20000000;i++)
		{
			Heros.add(new Hero("Hero"+(int)(Math.random()*9000+1000)));
		}
		for(int i = 0;i < 20000000;i++)
		{
			//System.out.println(Heros.get(i));
			if(Heros.get(i).equals("Hero5555"))
			{
				number++;
			}
		}
		endTime = System.nanoTime();
		System.out.printf("Hero5555一共有%d个。花费了%d",number,endTime-startTime);
		*/
		HashMap<Integer,Hero>  Heros= new HashMap();
		for(int i = 0;i < 20000000;i++)
		{
			Heros.put(i,new Hero("Hero"+(int)(Math.random()*9000+1000)));
		}
	
	}
}

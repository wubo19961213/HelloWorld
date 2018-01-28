package arrayList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import charactor.Hero;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList Heros = new ArrayList<>();
		for(int i=1;i<6;i++)
		{
			Heros.add(new Hero("Hero"+i));
		}
		System.out.println(Heros);
		Hero specialHero = new Hero("Special Hero");
		Heros.add(3,specialHero);
		System.out.println(Heros);
		// 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(Heros.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(Heros.contains(specialHero));
        System.out.println(Heros.get(4));
        Heros.remove(2);
        System.out.println(Heros.indexOf(specialHero));
        Heros.set(4, new Hero("hero 5"));
        System.out.println(Heros.get(4));
        System.out.println(Heros.size());
        Hero hs[] = (Hero[])Heros.toArray(new Hero[]{});
        System.out.println(hs.toString());
        System.out.println(Heros.equals("Hero1"));
        List<HeroNItem>genericH = new ArrayList<HeroNItem>();
        genericH.add(new Hero("awd"));
       // genericH.add(new Hero("awd"));
        Iterator<Hero> it = Heros.iterator();
        while(it.hasNext())
        {
        	Hero h = it.next();
        	System.out.println(h);
        }
        for(Hero h:Heros)
        {
        	System.out.println(h);
        }
		*/
		Queue<Hero> q= new LinkedList<Hero>();
		//q.add(new Hero(Hero1));
		q.offer(new Hero("Hero1"));
		q.offer(new Hero("Hero2"));
		q.offer(new Hero("Hero3"));
		q.offer(new Hero("Hero4"));
		q.offer(new Hero("Hero5"));
		Hero hero = q.poll();
		System.out.println(hero);
		Hero hero1 = q.poll();
		System.out.println(hero1);
		System.out.println(q);
		
	}

}

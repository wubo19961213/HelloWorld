package generic;

import java.util.ArrayList;

import charactor.ADHero;
import charactor.Hero;

public class TestGeneric {
	public static void iterate(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<? extends Hero> hs = new ArrayList<>();
 
        iterate(hs);
        ArrayList<Hero> hs1 =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();
  
        //���෺��ת���෺�ͣ��ܷ�ɹ���Ϊʲô��
        //adhs = hs1;
    }
 
}


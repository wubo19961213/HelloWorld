package multiplethread;

import charactor.Hero;

public class TestThread {
	 
    public static void main(String[] args) {
         
        Hero gareen = new Hero("");
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 1;
 
        Hero teemo = new Hero("");
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 1;
         
        Hero bh = new Hero("");
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 1;
         
        Hero leesin = new Hero("");
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 1;
         
        //���׹�����Ī
        /*while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
 
        //�ͽ����˹���äɮ
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }*/
        /*KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();*/
        Battle b1 = new Battle(bh, leesin);
        Thread thread1 = new Thread(b1);
        /*try {
        	thread1.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
        Battle b2 = new Battle(gareen,teemo);
        Thread thread2 = new Thread(b2);
        //thread1.setPriority(Thread.MAX_PRIORITY);
        //thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        //thread1.sleep();
        //thread2.start();
        
        
    }
     
}
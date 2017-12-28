package com.Demo_1;

public class HelloWorld_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[(int) (Math.random() * 10)];
		int []b =new int[(int) (Math.random() * 10)];
		for(int i=0;i<a.length;i++)
		{
			a[i] = (int) (Math.random() * 100);
			System.out.println("a:"+a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			b[i] = (int) (Math.random() * 100);
			System.out.println("b:"+b[i]);
		}
		int[]c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for (int i : c) {
			System.out.println("c:"+i);
		}
			
	}

}

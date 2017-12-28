package com.Demo_1;

public class HelloWorld_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
		int min;
		int c;
		a = new int[5];
		int []b = new int[10];
		b[1] = 2;
		System.out.println(b.length);
		b[0] = (int) (Math.random() * 100);
		b[2] = (int) (Math.random() * 100);
		b[3] = (int) (Math.random() * 100);
		b[4] = (int) (Math.random() * 100);
		b[5] = (int) (Math.random() * 100);
		b[6] = (int) (Math.random() * 100);
		b[7] = (int) (Math.random() * 100);
		b[8] = (int) (Math.random() * 100);
		b[9] = (int) (Math.random() * 100);
		min = b[0];
		for(int i=0;i<b.length;i++)
		{
			if(min>b[i])
			{
				min = b[i];
			}
			System.out.println(b[i]);
		}
		System.out.println("×îĞ¡Öµ£º"+min);
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
	}

}

package com.Demo_1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI��ʽ
//		int wient;
//		float heght;
//		double BMI;
//		Scanner s = new Scanner(System.in);
//		System.out.println("����������");
//		wient = s.nextInt();
//		System.out.println("���������");
//		heght = s.nextFloat();
//		BMI = wient/(heght*heght);
//		if(BMI<18.5)
//			System.out.println("���IBM��ֵ�ǣ�"+BMI+",���ع���");
//		else if(BMI>=18.5 && BMI<24)
//			System.out.println("���IBM��ֵ�ǣ�"+BMI+",��������");
//		else if(BMI<27 && BMI>=24)
//			System.out.println("���IBM��ֵ�ǣ�"+BMI+",���ع���");
		//����
//		int month;
//		Scanner s = new Scanner(System.in);
//		month = s.nextInt();
//		switch (month) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("����");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("����");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("����");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("����");
//			break;
//		default:
//			break;
//		}
		int moneyEachDay = 0;
        int day = 10;
        int sum=0;
        for (int i = 1; i <= day; i++) {
            if(0==moneyEachDay)
                moneyEachDay = 1;
            else
                moneyEachDay *= 2;
              
            sum+=moneyEachDay;
              
            System.out.println(i + " ��֮�󣬺�������е�Ǯ������: " + sum );
        }
	}

}

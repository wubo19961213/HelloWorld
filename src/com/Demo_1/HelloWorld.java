package com.Demo_1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI公式
//		int wient;
//		float heght;
//		double BMI;
//		Scanner s = new Scanner(System.in);
//		System.out.println("请输入体重");
//		wient = s.nextInt();
//		System.out.println("请输入身高");
//		heght = s.nextFloat();
//		BMI = wient/(heght*heght);
//		if(BMI<18.5)
//			System.out.println("你的IBM数值是："+BMI+",体重过轻");
//		else if(BMI>=18.5 && BMI<24)
//			System.out.println("你的IBM数值是："+BMI+",体重正常");
//		else if(BMI<27 && BMI>=24)
//			System.out.println("你的IBM数值是："+BMI+",体重过重");
		//季节
//		int month;
//		Scanner s = new Scanner(System.in);
//		month = s.nextInt();
//		switch (month) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("冬天");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("春天");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("夏天");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("秋天");
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
              
            System.out.println(i + " 天之后，洪帮主手中的钱总数是: " + sum );
        }
	}

}

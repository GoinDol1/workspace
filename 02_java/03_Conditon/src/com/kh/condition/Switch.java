package com.kh.condition;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {		
		// method2();
		method3();
	}

	public static void method3() {
		/*
		 * "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
		 * 
		 * 월을 입력하세요 : XX
		 * XX월은 XX일까지입니다.
		 * 
		 * * 1,3,5,7,8,10,12 => 31
		 * * 4,6,9,11        => 30
		 * * 2               => 28
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("월을 입력하세요 : ");
		int inValue = sc.nextInt();		
		switch (inValue) 
		{
			case 1:  
			case 3:  
			case 5:  
			case 7:  
			case 8:  
			case 10:  
			case 12: System.out.println(inValue + "월은 31일까지입니다."); break;			
			case 4:
			case 6:
			case 9:
			case 11: System.out.println(inValue + "월은 30일까지입니다."); break;			
			case 2:  System.out.println(inValue + "월은 28일까지입니다."); break;			
			default: System.out.println(inValue + " 존재하지 않는 월입니다.");	
		}		
		sc.close();
	}
	
	public static void method2() {
		/*
		 * 과일을 구매하는 프로그램
		 * 사용자가 구매하고자 하는 과일을 입력하면, 해당 가격을 출력
		 * 출력 => {과일이름}의 가격은 {과일가격}원입니다.
		 * 사과 : 15000
		 * 포도 : 30000
		 * 귤   : 8000
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("과일이름을 입력하세요 : ");
		String inValue = sc.nextLine();		
		switch (inValue) 
		{
			case "사과":  System.out.println(inValue + "의 가격은 " + 15000 + "원입니다."); break;			
			case "포도":  System.out.println(inValue + "의 가격은 " + 30000 + "원입니다."); break;			
			case "귤":   System.out.println(inValue + "의 가격은 " + 8000 + "원입니다."); break;			
			default: System.out.println(inValue + " 과일이 없어요");	
		}		
		sc.close();
	}
	
}

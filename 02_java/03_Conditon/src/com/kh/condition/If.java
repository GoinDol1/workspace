package com.kh.condition;

import java.util.Scanner;

public class If {
	/*
	 * 조건문 if
	 * : 기본적으로 프로그램은 순차적으로 진행 (위->아래, 왼쪽->오른쪽)
	 *  순차적인 흐름 바꿀때 제어문(조건문, 반복문, ..)을 사용하여 제어 가능
	 *  : 조건문 - 조건에 따라 선택적으로 실행할 때 
	 *  : 반복문 - 반복적으로 실행할 때
	 *  
	 *  :"조건식"을 통해 참인지, 거짓인지 판단하여 그에 해당하는 코드를 실행
	 *  => 조건식의 결과 : true, false
	 *  => 연산자 : 비교(>< == ..), 논리연산자(&& ||)를 주로 사용
	 *  
	 *  : 조건문의 종류 : if, switch
	 *  * if
	 *       [1] 단독 if문
	 *           if (조건식) {
	 *           	// 조건식이 참인 경우 실행할 코드
	 *           }
	 *           // => 조건식이 거짓인 경우 실행되는 내용은 없음!
	 *      [2] if ~ else문
	 *          if (조건식) {
	 *          	// 조건식이 참인 경우 실행할 코드          
	 *          } else {
	 *              // 조건식이 거짓인 경우 실행할 코드
	 *          }
	 *      [3] if ~ else if ~ else문
	 *          if (조건식) {
	 *             // 조건식이 참인 경우 실행할 코드
	 *          } else if (조건식2) {
	 *              // 조건식이 거짓이고, 조건식2가 참인 경우 실행할 코드
	 *          } else {
	 *          	// 조건식, 조건식2 모두 거짓인 경우 실행할 코드
	 *          }
	 */
	public static void main(String[] args) {		
		//method2();
		// method3();
		method4();
	}

	public static void method4() {
		/*
		 * 정수를 입력받아, 아래 조건에 따라 출력
		 * - 1 : 빨강
		 * - 2 : 파란 
		 * - 3 : 초록
		 * - 그외 : 잘못입력하셨습니다.
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수를 입력하세요 : ");
		int inValue = sc.nextInt();
//		switch (inValue) 
//		{
//			case 1:  System.out.println("빨강색"); break;			
//			case 2:  System.out.println("파란색"); break;			
//			case 3:  System.out.println("초록색"); break;			
//			default: System.out.println("잘못입력하셨습니다.");	
//		}
		// => if문으로 작성한다면...
		if(inValue == 1) System.out.println("빨강색");
		else if(inValue == 2) System.out.println("파란색");
		else if(inValue == 3) System.out.println("초록색");
		else System.out.println("잘못입력하셨습니다.");		
		sc.close();
	}
	
	public static void method3() {
		/*
		 * 주민번호 입력받아서 남자인지, 여자인지 출력
		 * (단, - 포함해서 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다." 출력)
		 * * 문자열 길이 확인 메소드: 문자열.length()
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("주민번호를 입력하세요 : ");
		String inValue = sc.nextLine();
		if (inValue.length() != 14) 
			System.out.println("잘못 입력되었습니다.");
		else {
			if ((int) inValue.charAt(7) % 2 == 0)
				System.out.println("여성");
			else
				System.out.println("남성");
		}
		sc.close();
	}
	
	
	public static void method2() {
		/*
		 * 사용자의 입력 값이 1 ~ 10 사이의 값인지 확인하여
		 * 범위를 벗어난 경우 "범위를 벗어났습니다." 출력
		 * 범위 내에 있는 경우 입력값을 출력
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("문자를 입력하세요 : ");
		char inValue = sc.next().charAt(0);		
		if ('a' <= inValue && inValue <= 'z')
			System.out.println("소문자 입니다. " + inValue);
		else if ('A' <= inValue && inValue <= 'Z')
			System.out.println("대문자 입니다.");
		else System.out.println("알파벳이 아닙니다.");
		
		sc.close();
	}
	
	
	public static void method1() {
		/*
		 * 사용자의 입력 값이 1 ~ 10 사이의 값인지 확인하여
		 * 범위를 벗어난 경우 "범위를 벗어났습니다." 출력
		 * 범위 내에 있는 경우 입력값을 출력
		 */
		Scanner sc = new Scanner(System.in);		
		System.out.print("숫자를 입력하세요 : ");
		int inValue = sc.nextInt();		
		if (1 <= inValue && inValue <= 10)
			System.out.println("입력값: " + inValue);
		else
			System.out.println("범위를 벗어났습니다.");
		sc.close();
	}

	
	
}

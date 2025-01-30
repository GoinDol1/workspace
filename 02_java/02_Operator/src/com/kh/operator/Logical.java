package com.kh.operator;

import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {
		 /*
		  * 논리 연산자 (이항 연산자)
		  * : 두 개의 논리값을 연산 (true/false )
		  * : 결과값도 논리값
		  * 
		  * * 종류 : && || 
		  *   - A && B : A, B 모두 true 값이어야 결과값이 true.
		  *   true && true   => true
		  *   true && false  => false
		  *   false && true  => false
		  *   false && false => false
		  *   
		  *   - A || B : A 또는 B 둘 중 하나라도 true라면 결과값이 true.
		  *   true || true => true
		  *   true || false => true
		  *   false || true => true
		  *   false || false => false
		  *   
		  *   ---------------------------------
		  *   주의사항. SCE (Short-Circuit Evaluation)
		  *   * && 연산자 : 왼쪽(앞) 조건이 false라면 오른쪽(뒤) 조건은 실행되지 않음
		  *   * || 연산자 : 왼쪽(앞) 조건이 true라면 오른쪽(뒤) 조건은 실행되지 않음
		  * 
		  */
		// method1();
		method2();
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10 사이의 숫자 : ");
		int inValue = sc.nextInt();
		
		// boolean tf = (1 <= inValue) && (inValue <= 10);
		if (1 <= inValue && inValue <= 10) 
		// if (tf)
			System.out.println("1 ~ 10 사이의 숫자입니다.");
		else
			System.out.println("1 ~ 10 사이의 숫자가 아닙니다.");
		
		sc.close();
	}

	public static void method2() {
		// 입력받은 문자가 소문자인지 확인
		// 'a' : 97 ~ 'z' : 122		
		Scanner sc = new Scanner(System.in);		
		System.out.print("문자를 입력하세요 : ");
		char inValue = sc.next().charAt(0);		
		if ('a' <= inValue && inValue <= 'z') 
			System.out.printf("소문자 입니다. %c(%d)\n", inValue, (int)inValue);
		else
			System.out.printf("소문자가 아닙니다. %c(%d)\n", inValue, (int)inValue);		
		sc.close();
		
		
	}
	
}

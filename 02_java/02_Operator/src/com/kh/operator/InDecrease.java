package com.kh.operator;

public class InDecrease {
	/*
	 * 증감연산자 (단항 연산자)
	 * 
	 * ++ : 값을 1씩 증가시키는 연산자
	 * -- : 값을 1씩 감소시키는 연산자
	 * 
	 * * 처리순서 : 다른 연산자가 있을 경우 *
	 *  - (증감연산자)변수 : 전위연산 => "선증감" 후처리
	 *    ++변수, --변수
	 *  - 변수(증감연산자) : 후위연산 => 선처리 "후증감"
	 *    변수++, 변수-- 
	 */

	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}
	public static void method3() {
		int a = 10;
		int b = 20;
		int c = 30;

		int r1 = a++;
		
		System.out.printf("a : %d, b : %d, c : %d, r1: %d\n", a, b, c, r1);
		
		int r2 = (++a) + (b++);
		// => 32 = 12 + 20
		System.out.printf("r2 : %d, a : %d, b : %d\n", r2, a, b);
		
		int r3 = (a++) + (--b) + (--c);
		// => 61  = 12 + 20 + 29 
 
		System.out.printf("r3 : %d, a : %d, b : %d, c : %d\n", r3, a, b, c);
		// 13 20 29
	}
	
	public static void method2() {
		int num1 = 20;
		int result1 = ++num1 * 3;
		
		System.out.printf("num1 : %d, result: %d\n", num1, result1);
		
		int num2 = 20;
		int result2 = num2++ * 3;
		
		System.out.printf("num2 : %d, result2: %d\n", num2, result2);
	}
	public static void method1() {
		int num1 = 10;
		
		System.out.println("num1 : " + num1); // num1 => 10
		System.out.println("전위연산 1회 수행 (++num1): " + ++num1);  // num1 => 11
		System.out.println("후위연산 1회 수행 (num1++): " + num1++);  // num1 => 11
		System.out.println("최종 num1 : " + num1);  // num1 => 12
	}
}



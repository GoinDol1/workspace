package com.kh.operator;

public class Airthmetic {
	/*
	 * 산술연산자 (이항연산자)
	 * ->  +  -  *  /  %
	 * 
	 * 우선 순위 : * / % > + - 
	 */
	public static void main(String[] argv) {
		method2();
	}

	public static void method2() {
		int a = 5;
		int b = 10;

		int c = (++a) + b;     // c => 16  a: 6, b : 10 
		int d = c / a;         // d => 2   16 / 6
		int e = c % a;         // e => 4   16 mod 6
		int f = e++;           // f => 4
		int g = (--b) + (d--); // g => 11   9 + 2 
		int h = 2;             // h => 2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // i =>
		//       6 + 11 / (15 / 4) * (11 - 1) % (6 + 2) 
		//       6 + 11 / (3) * 10 % 7;
		// 12
		System.out.printf("a : %d, b : %d, c : %d, d : %d", a, b, c, d);		
		System.out.printf("e : %d, f : %d, g : %d, h : %d  i: %d", e, f, g, h, i);
		// 7, 9, 15, 1, 6 4 10 2 12
		
	}
	
	public static void method1() {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 나머지 연산자 (%) -> 짝수/홀수 판별
		// (변수 % 2 == 0) --> 짝수
		// (변수 % 2 != 0) --> 홀수
		
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0));
		System.out.printf("n2의 값은 짝수인가? %b\n", (n2 % 2 == 0));
	}
}

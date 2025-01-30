package com.kh;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		num2 = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", num1 + num2);
		System.out.printf("빼기  결과 : %d\n", num1 - num2);
		System.out.printf("곱하기 결과 : %d\n", num1 * num2);
		System.out.printf("빼기  결과 : %d\n", num1 / num2);
		
		sc.close();
	}
}

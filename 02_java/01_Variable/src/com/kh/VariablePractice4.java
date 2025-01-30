package com.kh;
import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자열을 입력하세요\n");
		str = sc.next();
		
		System.out.printf("첫 번째 문자 : %c\n", str.charAt(0));
		System.out.printf("두 번째 문자 : %c\n", str.charAt(1));
		System.out.printf("세 번째 문자 : %c\n", str.charAt(2));
		
		sc.close();
	}
}

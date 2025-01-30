package com.kh;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");		
		char keyInChar = sc.next().charAt(0);
		
		System.out.println(keyInChar + " Unicode : " + (int)keyInChar);
		sc.close();
	}

}

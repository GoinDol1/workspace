package com.kh;
import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력: ");
		x = sc.nextDouble();
		System.out.print("세로 입력: ");
		y = sc.nextDouble();
		
		System.out.printf("면적 : %5.2f\n", x * y);
		System.out.printf("둘레 : %4.1f\n", (x + y) * 2);
		
		sc.close();
	}
}

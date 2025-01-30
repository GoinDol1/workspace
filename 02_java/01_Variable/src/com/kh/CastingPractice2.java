package com.kh;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		double korScore, engScore, mathScore;
		int tot, avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		korScore = sc.nextDouble();
		System.out.print("영어: ");
		engScore = sc.nextDouble();
		System.out.print("수학: ");
		mathScore = sc.nextDouble();
		
		tot = (int)(korScore + engScore + mathScore);
		avg = (int)((korScore + engScore + mathScore)/3);
		
		System.out.printf("국어 : %f\n", korScore);
		System.out.printf("영어 : %f\n", engScore);
		System.out.printf("수학 : %f\n", mathScore);
		System.out.printf("총점 : %d\n", tot);
		System.out.printf("평균 : %d\n", avg);
		
		sc.close();		

	}

}

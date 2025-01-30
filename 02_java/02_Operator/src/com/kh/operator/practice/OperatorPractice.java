package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		practice11();
	}
	
	public static void practice1() {
		// 실습문제 1 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inValue = sc.nextInt();
		System.out.println(inValue <= 0 ? "양수가 아니다" : "양수"); 
		sc.close();
	}
	
	public static void practice2() {
		// 실습문제 2 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inValue = sc.nextInt();
		System.out.println((inValue > 0) ? "양수다" 
						   : inValue == 0 ? "0이다" 
						   : "음수다"); 
		sc.close();
	}
	
	public static void practice3() {
		// 실습문제 3 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inValue = sc.nextInt();
		System.out.println((inValue % 2 == 0) ? "짝수다" 
						   : "홀수다"); 
		sc.close();
	}
	
	public static void practice4() {
		// 실습문제 4 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int inValue1 = sc.nextInt();
		System.out.print("사탕수를 입력하세요 : ");
		int inValue2 = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + inValue2 / inValue1 + 
				           "남은 사탕 개수 : " + inValue2 % inValue1); 
		sc.close();
	}
	
	public static void practice5() {
		// 실습문제 5 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String inName = sc.nextLine();		
		System.out.print("학년(숫자만) 입력하세요 : ");
		int inGrade = sc.nextInt();		
		System.out.print("반(숫자만) 입력하세요 : ");
		int inClass = sc.nextInt();		
		System.out.print("번호(숫자만) 입력하세요 : ");
		int inNo = sc.nextInt();		
		System.out.print("성별(M/F) 입력하세요 : ");
		char inGender = sc.next().charAt(0);		
		System.out.print("성적(소수점 아래 둘째자리까지) 입력하세요 : ");
		double inSchoolRecord = sc.nextDouble();		
		System.out.println(inGrade + "학년 " + inClass + "반 " + inNo +
			   "번 " + inName + " " + ((inGender=='M') ? "남" : "여") + "학생의 성적은 " + inSchoolRecord + "이다."); 
		sc.close();
	}

	public static void practice6() {
		// 실습문제 6 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int inAge = sc.nextInt();
		System.out.println( (inAge <= 13) ? "어린이" 
				: (13 < inAge && inAge <= 19) ? "청소년"
				: "성인");
		sc.close();
	}

	public static void practice7() {
		// 실습문제 7 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int inKor = sc.nextInt();
		System.out.print("영어 : ");
		int inEng = sc.nextInt();
		System.out.print("수학 : ");
		int inMath = sc.nextInt();
		
		int sum = inKor + inEng + inMath;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum); 
		System.out.println("평균 : " + avg); 
		System.out.println( 
				(inKor >= 40 && inEng >= 40 && inMath >= 40 && avg >= 60.0) 
				? "합격" : "불합격"); 
		sc.close();		
	}
	
	public static void practice8() {
		// 실습문제 8 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		int inGenderCode = (int)sc.next().charAt(7);
		System.out.println((inGenderCode % 2 == 0) ? "여성" : "남성"); 
		sc.close();
	}

	public static void practice9() {
		// 실습문제 9 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int inValue1 = sc.nextInt();
		System.out.print("정수2 : ");
		int inValue2 = sc.nextInt();		
		System.out.print("입력 : ");
		int inCheck = sc.nextInt();
		
		System.out.println((inValue1 >= inCheck || inCheck > inValue2) && (inValue1 <= inValue2) ? true : false); 
		sc.close();
	}
	
	public static void practice10() {
		// 실습문제 10 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int inValue1 = sc.nextInt();
		System.out.print("입력2 : ");
		int inValue2 = sc.nextInt();		
		System.out.print("입력3 : ");
		int inValue3 = sc.nextInt();
		
		System.out.println((inValue1 == inValue2 && inValue2 == inValue3) ? true : false); 
		sc.close();
	}
	
	public static void practice11() {
		// 실습문제 11 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int inValue1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int inValue2 = sc.nextInt();		
		System.out.print("C사원의 연봉 : ");
		int inValue3 = sc.nextInt();
		
		System.out.println("A사원 연봉/연봉+a : " + inValue1 + "/" + (inValue1+inValue1*0.4));
       	System.out.println(((inValue1 + inValue1*0.4) >= 3000.0) ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : " + inValue2 + "/" + inValue2);
		System.out.println((inValue2 >= 3000.0) ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : " + inValue3 + "/" + (inValue3+inValue3*0.15));
		System.out.println(((inValue3 + inValue3*0.15) >= 3000.0) ? "3000 이상" : "3000 미만");
		sc.close();
	}
}



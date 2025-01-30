package com.kh.condition;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// method1();
		// method2();
		// method3();
		// method4();		
		// method5();
		// method6();
		// method7();
		// method8();
		method9();
	}

	public static void method9() {
		Scanner sc = new Scanner(System.in);
		
		sc.close();
	}	
	
	public static void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int inValue1 = sc.nextInt();		
		System.out.print("피연산자2 입력 : ");
		int inValue2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");		
		char inOperator = sc.next().charAt(0);
		
		switch (inOperator)
		{
			case '+':
				System.out.println(inValue1 + " + " + inValue2 + " = " + (inValue1 + inValue2)); break;
			case '-':
				System.out.println(inValue1 + " - " + inValue2 + " = " + (inValue1 - inValue2)); break;
			case '*':
				System.out.println(inValue1 + " * " + inValue2 + " = " + (inValue1 * inValue2)); break;
			case '/':
				System.out.println(inValue1 + " / " + inValue2 + " = " + (inValue1 / (float)inValue2)); break;
			case '%':
				System.out.println(inValue1 + " % " + inValue2 + " = " + (inValue1 % (float)inValue2)); break;
			default :
				System.out.println("프로그램을 종료합니다.");
		}
		sc.close();
	}	

	public static void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 입력(m) : ");
		double inHeight = sc.nextDouble();		
		System.out.print("몸무게 입력(kg) : ");
		double inWeight = sc.nextDouble();
		
		String result = "";
		double bmi;

		bmi = inWeight / (inHeight*inHeight);		
		if (bmi < 18.5)
			result = "저체중";
		else if(18.5 <= bmi && bmi < 23)
			result = "정상체중";
		else if(23.0 <= bmi && bmi < 25)
			result = "과체중";
		else if(25.0 <= bmi && bmi < 30)
			result = "비만";
		else if(bmi >= 30)
			result = "고도 비만";
		
		System.out.println(" BMI 지수 : " + bmi);
		System.out.println(result);
		
		sc.close();
	}	
	
	public static void method6() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();		
		switch (grade) {
			case "관리자" :
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
				break;
			case "회원" :
				System.out.println("게시글 작성. 게시글 조회, 댓글 작성");
				break;
			case "비회원" :
				System.out.println("게시글 조회");
				break;
		}		
		sc.close();		
	}	
	
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		if(id.equals("myId") && password.equals("myPassword12"))
			System.out.println("로그인 성공");
		else if (!password.equals("myPassword12"))
			System.out.println("비밀번호가 틀립니다");
		else if (!password.equals("myId"))
			System.out.println("아이디가 틀립니다.");
		
		/*
		if(id != "myId")
			System.out.println("아이디가 틀렸습니다.");
		else if (password != "myPassword12")
			System.out.println("비밀번호가 틀렸습니다.");
		else System.out.println("로그인 성공");
		*/
		sc.close();		
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch (month)
		{
			case 1:
			case 2:
			case 12: System.out.println(month + "월은 겨울 입니다.");break;
			case 3:
			case 4:
			case 5: System.out.println(month + "월은 봄 입니다.");break;
			case 6:
			case 7:
			case 8: System.out.println(month + "월은 여름 입니다.");break;
			case 9:
			case 10:
			case 11: System.out.println(month + "월은 가을 입니다."); break;
			default : System.out.println(month + "월은 잘못 입력된 달입니다."); 
		}
		sc.close();		
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int inKor = sc.nextInt();
		System.out.print("수학점수 : ");
		int inMath = sc.nextInt();
		System.out.print("영어점수 : ");
		int inEng = sc.nextInt();
		
		int sum = inKor + inEng + inMath;
		double avg = sum / 3.0;

		System.out.println("국어 : " + inKor); 
		System.out.println("수학 : " + inMath); 
		System.out.println("영어 : " + inEng);
		
		System.out.println("합계 : " + sum); 
		System.out.println("평균 : " + avg); 
		System.out.println( 
				(inKor >= 40 && inEng >= 40 && inMath >= 40 && avg >= 60.0) 
				? "축하합니다, 합격입니다." : "불합격"); 
		sc.close();		
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int inValue = sc.nextInt();
		if (inValue > 0) {
			if (inValue % 2 == 0) 
				System.out.println("짝수다.");
			else
				System.out.println("홀수다.");
		}
		else
			System.out.println("양수만 입력해주세요.");
		sc.close();
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴번호를 입력하세요 : ");
		int inValue = sc.nextInt();		
		switch (inValue) 
		{
			case 1:  System.out.println("입력 메뉴 입니다."); break;
			case 2:  System.out.println("수정 메뉴 입니다."); break;
			case 3:  System.out.println("조회 메뉴 입니다."); break;
			case 4:  System.out.println("삭제 메뉴 입니다."); break;
			case 7: System.out.println("프로그램이 종료됩니다."); break;			
			default: System.out.println("존재하지 않는 번호 입니다.");	
		}		
		sc.close();
	}
}

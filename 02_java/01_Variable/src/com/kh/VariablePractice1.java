package com.kh;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		String name;
		// String gender;
		char gender;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.nextLine();
//		System.out.println("성별을 입력하세요 : ");
//		// gender = sc.nextLine(); nextChar 없음 casting도 안됨
//		gender = sc.next().charAt(0);  // .charAt(인덱스값) : 문자열 인덱스 위치의 한문자를 반환		
//		System.out.println("나이를 입력하세요 : ");
//		age = sc.nextInt();
//		System.out.println("키를 입력하세요 : ");
//		height = sc.nextFloat();		
//		System.out.printf("키 " + height + "cm인 " + age + "살 " + gender + " " + name + "님 반갑습니다.^^");

		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("성별을 입력하세요 : ");
		// gender = sc.nextLine(); nextChar 없음 casting도 안됨
		gender = sc.next().charAt(0);  // .charAt(인덱스값) : 문자열 인덱스 위치의 한문자를 반환		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();		
		System.out.printf("키 %5.2fcm인 %d살 %c %s님 반갑습니다.^^", height, age, gender, name);
		
		sc.close();
	}

}

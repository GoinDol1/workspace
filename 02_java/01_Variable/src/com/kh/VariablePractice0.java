package com.kh;

import java.util.Scanner;

public class VariablePractice0 {

	public static void main(String[] args) {
		/*
		 * (1) 아래 코드를 변수를 사용하여 실행
		 */
		System.out.println("현재 2025년이고 올해 20살입니다.");
		// => 매년 출력한다면.. 어떤 부분을 변수로 사용할지?
		int yyyy = 2025;
		int age = 20;
		
		System.out.println("현재 " + yyyy + " 년이고 올해 " + age + "살입니다.");
		System.out.printf("현재 %d 년이고 올해 %d살입니다\n", yyyy, age);
		
		System.out.println("몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		final int WEIGHT = 80;
		System.out.println("몸무게가 " + WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		System.out.printf("몸무게가 %dkg 이상인 경우 탑승하지 못합니다.", WEIGHT);
		
		System.out.println("---------------------------");
		/*
		 * 입력을 받기 위한 기능을 포함 클래스 : Scanner
		 *   1) 연결 : import 전체클래스명; // 패키지경로.클래스명
		 *            import java.util.Scanner;
		 *   2) 생성 : new 생성자;
		 *            new Scanner(System.in);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println(name+"님 반갑습니다.^^");
		
		// 나이를 입력받아 출력 .nextInt()
		System.out.println("나이는 ? ");
		int age2 = sc.nextInt();
		System.out.println(age2);
		
		System.out.print("하고싶은말 : ");
		String temp2 = sc.nextLine(); // nextInt에 \n이 남아서 입력된걸로 알고 입력 대기없이 넘어감
		                             // 버퍼 \n 비우기   
		System.out.println("진"+temp2+"짜");
		
		System.out.print("하고싶은말 : ");
		String temp = sc.nextLine();
		System.out.println(temp);
		
		
		
	}
	
	
}

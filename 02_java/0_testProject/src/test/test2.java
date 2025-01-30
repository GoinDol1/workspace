package test;

import java.util.Scanner; /* 누락 */

public class test2 {

	// 다음 코드에서 잘못된 부분을 찾아 수정
//	public class Study01 {

		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);   // out => in		    
				System.out.println("이름을 입력하세요 : ");  // System.out.printf("이름을 입력하세요 : "); or System.out.println("이름을 입력하세요 : ");				
				String name = sc.nextLine();			// 입력 변수 설정 				
				System.out.println("반갑습니다 ^^" + name + "님!");
		}

//	}
	// 다음 코드의 실행 결과를 예상
//	public class Study02 {
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.println("==== 입력한 값의 제곱한 결과를 표시 ===="); System.out.print(" : ");
	 * int num = sc.nextInt();
	 * 
	 * System.out.println("결과 => " + num*num); }
	 */
//	}
	
	/*
		* Study02 클래스 실행 결과 작성 *
		********************************
			==== 입력한 값의 제곱한 결과를 표시 ====
			 : 10
			 결과 => 100
		*
	*/

}
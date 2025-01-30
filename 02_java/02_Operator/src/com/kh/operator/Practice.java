package com.kh.operator;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {		
		// example01();	
		// example02();
		// example0etc();
		example03();
	}

	public static void example03() {
		/*
		 * 산술 연산자 활용 예제
		 * 키와 몸무게를 입력받아 BMI를 계산하여 출력
		 * * BMI : 몸무게 / (키(m) * 키(m));
		 * * BMI 판정 기준
		 *   - 18.5 이하 : 저체중
		 *   - 18.5 < BMI <= 22.9 : 정상
		 *   - 23.0 < BMI <= 24.9 : 과체중
		 *   - 25 <= BMI : 비만
		 *   
		 *   출력 예) "BMI 지수는 20.5로 정상입니다."
		 *   체중(kg)/[신장(m)]2 => 68/(1.6*1.6)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 입력(cm) : ");
		int inHeight = sc.nextInt();		
		System.out.print("몸무게 입력(kg) : ");
		int inWeight = sc.nextInt();
		
		String result;
		double bmi;

		bmi = inWeight / ((inHeight/100.0)*(inHeight/100.0));
		
		System.out.println("m :" + (inHeight/100.0));
		System.out.println("m*m :" + (inHeight/100.0)*(inHeight/100.0));
		
		if (bmi <= 18.5)
			result = "저체중";
		else if(18.5 < bmi && bmi < 23)
			result = "정상";
		else if(23.0 <= bmi && bmi <= 24.9)
			result = "과체중";
		else result = "비만";
		
		System.out.println(bmi + " bmi 평가 " + result);
		
		sc.close();
	}	
	
	public static void example0etc() {
		/*
		 *  SCE => &&, || 연산자가 수행될 때 두 항을 모두 실행하지 않더라도
		 *  결과를 알 수 있는 경우 뒤쪽 연산을 수행하지 않는다.
		 *  && : 앞의 조건이 false일 때 뒤의 조건이 수행 X
		 *  || : 앞의 조건이 true일 때 뒤의 조건이 수행 X
		 *  
		 */
		int num = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num += 15) < 0) && ((i*=2) > 2);
		System.out.println("====== && 연산 결과 ======");
		System.out.println("result2: " + result2);
		System.out.println("i: " + i);
		System.out.println("num: " + num);
		// => result2 : false, i : 3, num : 25		
		
		result2 = ((num += 15) < 0 || ((i*=2) > 2));
	}
	
	public static void example02() {
		/*
		 * 나이를 입력받아 초등학생, 중학생, 고등학생인지 구분하여 출력 (+ 그 외에는 "알수없음")
		 * - 초등학생 : 8살 ~ 13살
		 * - 중학생 : 14살 ~ 16살
		 * - 고등학생 : 17살 ~ 19살
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");		
		int inValue1 = sc.nextInt();

/*		
		String result;
		if(8 <= inValue1 && inValue1 <= 13)
			result = "초등학생 : " + inValue1;
		else if (14 <= inValue1 && inValue1 <= 16)
			result = "중학생 : " + inValue1;
		else if (17 <= inValue1 && inValue1 <= 19) 
			result = "고등학생 : " + inValue1;
		else result = "알수없음";
*/
		
		String result = 
			   (8 <= inValue1 && inValue1 <= 13) ? "초등학생 : " + inValue1 
			: (14 <= inValue1 && inValue1 <= 16) ? "중학생 : " + inValue1
			: (17 <= inValue1 && inValue1 <= 19) ? "고등학생 : " + inValue1
			: "알수없음";
		
		System.out.println(result);
		
		sc.close();
	}
	
	/*
	 * [1] 복합 대입 연산자
	 * 	   : 대입 연산자와 다른 연산자를 조합해 하나의 연산자처럼 사용되는 연산자
	 * 	   n1 += 10;
	 *     => n1 = n1 + 10;
	 */
	public static void example01() {
		/*
		 * 사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과를 출력
		 * // => 숫자를 입력받을 때 타입을 short 자료형 사용 (.nextShort())
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("더할 숫자를 입력하세요: ");
		
		short inValue1 = sc.nextShort();		
		System.out.println("원래값: " + inValue1 + "에서 7L 더한 결과 : " + (inValue1 += 7L));
		
		sc.close();
	}

}

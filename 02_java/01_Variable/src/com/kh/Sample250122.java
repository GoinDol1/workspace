package com.kh;

public class Sample250122 {
	// --------------------------------------------
	//		- 변수란? 메모리에 데이터를 저장하는 공간
	//		- 선언 (표현식) 자료형 변수명;
	//		- 자료형 종류
	//		      * 문자 : 문자형 ('a', '0', ), 문자열 ("a", "asd", ..)
	//		            - 문자   : char
	//		            - 문자열 : String
	//		      * 숫자 : 정수형 (1, 2, 3, -1, 0, 100), 실수형 (3.14, 0.55, ...)
	//		            - 정수형 : byte(1B), short(2B), int(4B), long(8B) 
	//		            - 실수형 : float(4B), double(8B)
	//		      * 논리형 (True/False) : boolean
	// --------------------------------------------
	// 잘못된 부분을 찾아 해결해주세요 *^^*
//	public class PersonInfo {
//	    public static void main(String[] args) {
//	        String name = "홍길동";
//	        int age = 25; 
//	        double height = 175.5; 
//	        char bloodType = 'O'; 
//
//	        System.out.println("이름: " + name);
//	        System.out.println("나이: " + age);
//	        System.out.println("키: " + height);
//	        System.out.println("혈액형: " + bloodType);
//	    }
//	}

//	public class BookInfo {
	    public static void main(String[] args) {
	        String title = "Java의 정석"; 
	        String author = "남궁성"; 
	        int pageCount = 1022; 
	        boolean isAvailable = false; 

	        System.out.println("책 제목: " + title);
	        System.out.println("저자: " + author);
	        System.out.println("페이지 수: " + pageCount);
	        System.out.println("대출 가능 여부: " + isAvailable);
	    }
//	}
}

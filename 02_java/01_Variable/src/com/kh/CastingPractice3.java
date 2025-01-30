package com.kh;

public class CastingPractice3 {
	public static void main(String[] args) {		
		method();
	}
	
	public static void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;		        
		double dNum= 2.5;		        
		char ch = 'A';
		        
		System.out.println( (int)dNum ); // 2
		System.out.println( (short)dNum ); // 2
		        
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (float)iNum1 ); // 10.0
		        
		System.out.println( (double)dNum ); // 2.5
		System.out.println( (float)dNum ); // 2.5
		        
		System.out.println( (int)fNum ); // 3
		System.out.println( (double)fNum ); // 3
		System.out.println( (float)fNum ); // 3.3333333
		System.out.println( (double)fNum ); // 3.3333333333333335
		        
		System.out.println( ch); // 'A'
		System.out.println( (byte)ch); // 65
		System.out.println( (byte)ch + 10);   // 75
		System.out.println( (char)(iNum1+65) ); // 'K'
    }
	

}

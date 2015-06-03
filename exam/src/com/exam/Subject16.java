package com.exam;

public class Subject16 {

	public static  int multiply(int n){
		
		if(n==1){
			return 1;
		}else{
			return n*multiply(n-1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Subject16.multiply(3));
	}

}

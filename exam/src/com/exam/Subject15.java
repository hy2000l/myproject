package com.exam;

public class Subject15 {

	public static int sum(int num){
//		if(num==1){
//			return 1;
//		}
		boolean path=false;
		int ret=0;
		int a=0;
		path=(num!=0)&&(a==(ret=sum(num-1)));
		return num+ret;
	}
	

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3));
		
	}

}

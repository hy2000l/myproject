package com.exam;

public class Subject13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello World!Welcome";
		String str2 = "el";
		int count=0;
		for(int i=0;i<=str1.length()-str2.length();i++){   
			  if(str2.equals(str1.substring(i, str2.length()+i))){ //这种比法有问题，会把"aaa"看成有2个"aa"子串。    
				   count++; 
			  }
		}
		System.out.println("子串在字符串中出现: "+count+" 次");
	}
}

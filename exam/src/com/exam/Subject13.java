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
			  if(str2.equals(str1.substring(i, str2.length()+i))){ //���ֱȷ������⣬���"aaa"������2��"aa"�Ӵ���    
				   count++; 
			  }
		}
		System.out.println("�Ӵ����ַ����г���: "+count+" ��");
	}
}

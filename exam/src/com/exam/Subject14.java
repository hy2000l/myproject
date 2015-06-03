package com.exam;

public class Subject14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbaccdeff";
		String c="";
		for(int i=0;i<str.length();i++){
			String temp=str.substring(0, i)+str.substring(i+1);
			int idx=temp.indexOf(str.charAt(i));
			if(idx==-1){
				c=String.valueOf(str.charAt(i));
				//System.out.println(c);
				break;
			}
			
			
		}
		System.out.println(c);
		
	}

}

package com.exam;
/**
 * 题目：输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，
 * 则删除之后的第一个字符串变成”Thy r stdnts.”。
 * */
public class Subject11 {
	
	public static void main(String[] args) {
		String str1="They are students";
		String str2="aeiou";
		for(int i=0;i<str2.length();i++){
			//int idx=str1.indexOf(str2.charAt(i));
			int idx=0;
			while((idx=str1.indexOf(str2.charAt(i)))!=-1){
				//str1=str1.replace(String.valueOf(str2.charAt(i)), "");
				str1=str1.substring(0,idx)+str1.substring(idx+1);
			}
		}
		System.out.println(str1);
	}
}

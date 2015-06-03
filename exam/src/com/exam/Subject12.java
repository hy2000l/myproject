package com.exam;
/**
 *翻转句子中单词的顺序。
 *题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。句子中单词以空格符隔开。
 *为简单起见，标点符号和普通字母一样处理。
 *例如输入“I am a student.”，则输出“student. a am I”。
 * 
 *
 */
public class Subject12 {
	public static void main(String[] args) {
		String str="I am a student.";
		
		String items[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=items.length-1;i>=0;i--){
			sb.append(items[i]);
			if(i!=0)sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}

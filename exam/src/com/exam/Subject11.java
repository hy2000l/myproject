package com.exam;
/**
 * ��Ŀ�����������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ���
 * ���磬���롱They are students.���͡�aeiou����
 * ��ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.����
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

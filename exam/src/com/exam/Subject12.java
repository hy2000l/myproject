package com.exam;
/**
 *��ת�����е��ʵ�˳��
 *��Ŀ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣�����е����Կո��������
 *Ϊ������������ź���ͨ��ĸһ������
 *�������롰I am a student.�����������student. a am I����
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

package com.exam;

public class Subject21 {

	/**
	 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӣ�
	 * �������Ӷ���������ÿ���µ���������Ϊ���٣�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int f1=1;
		int f2=1;
		int f=0;
		System.out.println("��1�������Ӷ�����"+f1);
		System.out.println("��2�������Ӷ�����"+f2);
		for(int i=3;i<=n;i++){
			f=f1+f2;
			f1=f2;
			f2=f;
			System.out.println("��"+i+"�������Ӷ�����"+f);
		}
	}

}

package com.exam;
/*
 * ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
 * ����6=1��2��3.���     �ҳ�1000���ڵ�����������
 */
public class Subject26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1; i<1000; i++) {
			 int t = 0;
			 for(int j=1; j<= i/2; j++) {
				 if(i % j == 0) {
					 t = t + j;}
				 }
			 if(t == i) {
				 System.out.print(i + "     ");
				}
			 }
	}

}

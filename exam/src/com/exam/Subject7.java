package com.exam;

import java.util.Arrays;

/**
 * ð�������㷨����������:
 * �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
 * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
 * 
 * */
public class Subject7 {
	public static void main(String[] args) {
		int arrnum[]={3,22,11,5,400,99,20,22,5};
		for(int i=0;i<arrnum.length-1;i++){
			for(int j=0;j<arrnum.length-i-1;j++){
				if(arrnum[j]>arrnum[j+1]){
					int temp=0;
					temp=arrnum[j+1];
					arrnum[j+1]=arrnum[j];
					arrnum[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrnum));
	}
}

package com.exam;

import java.util.Scanner;

public class Subject34 {

	/**
	 * ��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
	 */
	public static void main(String[] args) {
		
		boolean[] arr1=new boolean[10];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=true;
		}
		int count=5;//��¼ʣ������
		int idx=0;//��¼ԭλ������
		int num=0;//��¼����
		while(count>1){
			if(arr1[idx]){
				num++;
				if(num==3){
					arr1[idx]=false;
					count--;
					num=0;	
				}
			}
			idx++;
			if(idx==10){idx=0;}
			
		}
		for(int i=0;i<arr1.length;i++){
			if(arr1[i])
			System.out.println(i+1);
		}
		

	}
	

}

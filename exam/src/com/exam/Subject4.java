package com.exam;
/**
 * ��д����������nΪż��ʱ��
 * ���ú�����1/2+1/4+...+1/n,
 * ������nΪ����ʱ�����ú�����1/1+1/3+...+1/n
 * */
public class Subject4 {
	public static double sum(int num){
		 double ret=0;
		if(num%2==0){
			for(int i=2;i<=num;i=i+2){
				ret+=1.0/i;
			}
		}else{
			for(int i=1;i<=num;i=i+2){
				ret+=1.0/i;
			}
			
		}
		return ret;
	}
}

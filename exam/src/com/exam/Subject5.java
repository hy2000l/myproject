package com.exam;
/**
 * ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С������
 * ��С��һ������Ϊ��һ��ѭ���Ĵ�����
 * ȡ�õ�������Ϊ��һ��ѭ���Ľ�С���������ѭ��ֱ����С������ֵΪ0��
 * ���ؽϴ������������Ϊ���Լ����
 * ��С������Ϊ����֮���������Լ��
 */
public class Subject5 {
	public static int commonDivisor(int m,int n){
		int temp=0;
		if(m<n){
			temp=m;
			m=n;
			n=temp;
		}
		while(n!=0){
			temp=n;
			n=m%n;
			m=temp;
		
		}
		return m;
	}
	public static int minCommonMultiple2(int m,int n){
		int num=0;
		for(int i=Math.max(m, n);;i++){
			if(i%m==0&&i%n==0){
				num=i;
				break;
			}
			
		}
		return num;
	}
	public static int minCommonMultiple(int m,int n){
		int temp=0;
		int ret=m*n;
		while(n!=0){
			temp=n;
			n=m%n;
			m=temp;
		
		}
		return ret/m;
			
	}
	public static void main(String[] args) {
		System.out.println(Subject5.commonDivisor(10, 25));
	}
}

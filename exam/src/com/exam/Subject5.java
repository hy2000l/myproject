package com.exam;
/**
 * 在循环中，只要除数不等于0，用较大数除以较小的数，
 * 将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，
 * 返回较大的数，此数即为最大公约数，
 * 最小公倍数为两数之积除以最大公约数
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

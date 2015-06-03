package com.exam;

public class Subject21 {

	/**
	 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子，
	 * 假如兔子都不死，问每个月的兔子总数为多少？
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int f1=1;
		int f2=1;
		int f=0;
		System.out.println("第1个月兔子对数："+f1);
		System.out.println("第2个月兔子对数："+f2);
		for(int i=3;i<=n;i++){
			f=f1+f2;
			f1=f2;
			f2=f;
			System.out.println("第"+i+"个月兔子对数："+f);
		}
	}

}

package com.exam;
/**
 * 求斐波纳契数列1、1、2、3、5、8、13、21...前n相和
 * @author Administrator
 *
 */
public class Subject8 {
	public static void main(String[] args) {
		int n=5;
		int f1=1;
		int f2=1;
		int sum=f1+f2;
		for(int i=3;i<=n;i++){
			int f=f1+f2;
			f1=f2;
			f2=f;
			sum+=f;
		}
		System.out.println(sum);
	}
}

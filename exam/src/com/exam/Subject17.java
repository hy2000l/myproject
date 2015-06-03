package com.exam;

public class Subject17 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++){
			int item=1;
			for(int j=1;j<=i;j++){
				item*=j;
			}
			sum+=item;
		}
		System.out.println(sum);
	}
}

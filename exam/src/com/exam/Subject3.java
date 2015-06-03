package com.exam;

import java.util.Arrays;

/**
 * 编写程序对三个数x,y,z由小到大排序
 * */
public class Subject3 {
	public static void mehodB(){
		int[] num={8,10,6};
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-i-1;j++){
				if(num[j]>num[j+1]){
					int temp=0;
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(num));
		"abc".length();
	}
	public static void methodA() {
		int x=8;int y=10;int z=6;
		if(x>y){
			int t=0;
			t=y;
			y=x;
			x=t;
		}
		if(x>z){
			int t=0;
			t=z;
			z=x;
			x=t;
		}
		if(y>z){
			int t=0;
			t=z;
			z=y;
			y=t;
		}
		System.out.println(x+","+y+","+z);
	}
	public static void main(String[] args) {
		Subject3.mehodB();
	}
}

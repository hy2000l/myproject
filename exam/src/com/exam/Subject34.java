package com.exam;

import java.util.Scanner;

public class Subject34 {

	/**
	 * 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
	 */
	public static void main(String[] args) {
		
		boolean[] arr1=new boolean[10];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=true;
		}
		int count=5;//记录剩下人数
		int idx=0;//记录原位置索引
		int num=0;//记录报数
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

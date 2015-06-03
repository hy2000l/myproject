package com.exam;
/**
 * 查找最小的k个元素
 * 题目：输入n个整数，输出其中最小的k个。
 * 例如输入1，2，3，4，5，6，7和8这8个数字，则最小的4个数字为1，2，3和4。
 * @author Administrator
 *
 */
public class Subject33 {
	public static void main(String[] args) {
		int[] numArr={9,2,5,1,4,2,7};
		int temp=0;
		for(int i=0;i<numArr.length-1;i++){
			for(int j=i+1;j<numArr.length;j++){
				if(numArr[i]>numArr[j]){
					temp=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp;
				}
			}
		}
		for(int i=0;i<4;i++){
			System.out.println(numArr[i]);
		}
	}
}


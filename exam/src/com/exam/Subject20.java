package com.exam;
/**
 * 题目：将一个数组逆序输出
 * */
public class Subject20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[]{89,12,23,12,45};
		StringBuilder sb=new StringBuilder();
		for(int i=arr1.length-1;i>=0;i--){
			sb.append(arr1[i]);
			if(i!=0)sb.append(",");
			
		}
		System.out.println(sb.toString());
	}

}

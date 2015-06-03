package com.exam;

import java.util.Scanner;

/**
 * 5个人中挑选两个来担任礼仪人员（身高在160-190之间）。要求挑选出的两个人身高差最小。如果有身高差相同的则选取身高较高的。 
 * 输入：空格分割的五个身高数字，如“160 178 165 161 163”
 * 160 178 18
 * 160 165 5 
 * 160 161 1
 * 160 163 3
 * 
 * 178 165 13
 * 178 161 17
 * 178 163 15
 * 
 * 165 161 4
 * 165 163 2
 * 
 * 161 163 2
 * 输出：最适合的两个身高，按身高升序输出，如：“160 161”
 * @author Administrator
 *
 */
public class Subject29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights={160,178,165,161,163};
		int h1=0;
		int h2=0;
		int dvalue=Integer.MAX_VALUE;
		for(int i=0;i<heights.length;i++){
			for(int j=i+1;j<heights.length;j++){
				int diff=Math.abs(heights[i]-heights[j]);
				if(diff<=dvalue){
					int max=0;
					int min=0;
					if(heights[i]>=heights[j]){
						min=heights[j];
						max=heights[i];
					}else{
						min=heights[i];
						max=heights[j];
					}
					if(diff<dvalue||(diff==dvalue&&max>h2)){
						h1=min;
						h2=max;
					}
					dvalue=diff;
				}
				
			}
		}
		System.out.println(h1+" "+h2);
	}

}

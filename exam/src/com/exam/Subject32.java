package com.exam;
/**
 *  题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 *  加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
 *  再将第一位和第四位交换，第二位和第三位交换
 * @author Administrator
 *
 */
public class Subject32 {
	public static void main(String[] args) {
		int phoneNum=4582;
		int[] numArr=new int[4];
		int temp=0;
		numArr[0]=(phoneNum/1000+5)%10;
		numArr[1]=(phoneNum/100%10+5)%10;
		numArr[2]=(phoneNum/10%10+5)%10;
		numArr[3]=(phoneNum%10+5)%10;
		temp=numArr[0];
		numArr[0]=numArr[3];
		numArr[3]=numArr[0];
		temp=numArr[1];
		numArr[1]=numArr[2];
		numArr[2]=temp;
		for(int i=0;i<numArr.length;i++){
			System.out.print(numArr[i]);
		}
		
		
	}
}

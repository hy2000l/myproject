package com.exam;
/**
 * ������С��k��Ԫ��
 * ��Ŀ������n�����������������С��k����
 * ��������1��2��3��4��5��6��7��8��8�����֣�����С��4������Ϊ1��2��3��4��
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


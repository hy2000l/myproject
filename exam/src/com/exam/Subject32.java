package com.exam;
/**
 *  ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ�
 *  ���ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣�
 *  �ٽ���һλ�͵���λ�������ڶ�λ�͵���λ����
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

package com.exam;
/**
 *题目：求100之内的素数 
 *除了1和此整数自身外，不能被其他自然数整除的数
 */
public class Subject19 {
	public static void main(String[] args) {
		
		for(int i=3;i<=100;i++){
			int flag=1;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=0;
					break;
					
				}else{
					flag=1;
				}
			}
//			if(flag==1){
//				System.out.println(i);
//			}
			if(flag==0){
				System.out.println(i);
			}
		}
	}
}

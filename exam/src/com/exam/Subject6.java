package com.exam;
/**
 * 求1-20中最小公倍数
 * @author Administrator
 *
 */
public class Subject6 {
	
	public static void main(String[] args) {
		int num=0;
		for(int i=20;;i++){
			int flag=0;
			for(int j=1;j<=20;j++){
				if(i%j!=0){
					flag=1;
					break;
				}
				
				
			}
			if(flag==0){
				num=i;
				break;
			}
		}
		System.out.println(num);
	
		//Subject6.minMultiply();
	}
}

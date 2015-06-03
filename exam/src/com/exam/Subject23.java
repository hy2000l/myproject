package com.exam;
/**
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，
 * 又多吃了一个     第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下     的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
 *
 */
public class Subject23 {
	public static void methodB(){
		int x=1;
		for(int i=2;i<=10;i++){
			x=2*(x+1);
		}
		System.out.println(x);
	}
	public static void methodA(){
		
		int i=1;
		for(;;i++){
			int temp=i;
			for(int j=1;j<10;j++){
				temp=temp/2-1;
			}
			if(temp==1){break;}	
		}
		System.out.println(i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject23.methodA();
		Subject23.methodB();
	}

}

package com.exam;
/**
 * ��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬
 * �ֶ����һ��     �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ��     ��һ����һ����
 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶���
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

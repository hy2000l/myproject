package com.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ҫ�������������Կո�ָ�����֡�����һ��ֻ����һ�����ִ���һ���ж��������ݣ�����ÿ�����ݰ������ֳ��ֵ�Ƶ�ʴӵ͵������������
 * ���룺
 * ����
 * 2
 * 10 10 11 9 10 9 12 13 
 * 100 101 102 190 100 102
 * �����
 * 11 12 13 9 9 10 10 10
 * 101 190 100 100 102 102
 * @author Administrator
 *
 */
public class Subject30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��֯����
		 */
		int lineNum=2;
		String row1="10 10 11 9 10 9 12 13";
		String row2="100 101 102 190 100 102";
		String[] row1Arr=row1.split(" ");
		String[] row2Arr=row2.split(" ");
		String[][] data=new String[lineNum][];
		data[0]=row1Arr;
		data[1]=row2Arr;
		/*
		 * ���ݴ���
		 */
		List<List> list=new ArrayList<List>();
		for(int i=0;i<data.length;i++){//ȡÿһ��
			for(int j=0;j<data[i].length;j++){//ȡһ���е�ÿ��Ԫ��
				int count=0;
				List row=new ArrayList<String>();
				String item="";
				
				for(int k=0;k<data[i].length;k++){
					if(data[i][j]==data[i][k]){//ͳ�Ƴ��ֵ���
						count++;
					}
				}
				item=count+" "+data[i][j];
				row.add(item);
				list.add(row);
				
			}
			
		}
		
		
//		/*
//		 * �����ʾ
//		 */
//		for(List<String> row:list){
//			Collections.sort(row);
//			for(String item:row){
//				String[] itemData=item.split(" ");
//				for(int i=0;i<Integer.parseInt(itemData[0]);i++){
//					System.out.print(itemData[1]+" ");
//				}
//				
//			}
//			
//		}
		
	}

}

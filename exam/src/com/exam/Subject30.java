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
 * 要求输入若干行以空格分割的数字。（第一行只输入一个数字代表一共有多少行数据）对于每行数据按照数字出现的频率从低到高排序输出。
 * 输入：
 * 例：
 * 2
 * 10 10 11 9 10 9 12 13 
 * 100 101 102 190 100 102
 * 输出：
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
		 * 组织数据
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
		 * 数据处理
		 */
		List<List> list=new ArrayList<List>();
		for(int i=0;i<data.length;i++){//取每一行
			for(int j=0;j<data[i].length;j++){//取一行中的每个元素
				int count=0;
				List row=new ArrayList<String>();
				String item="";
				
				for(int k=0;k<data[i].length;k++){
					if(data[i][j]==data[i][k]){//统计出现的数
						count++;
					}
				}
				item=count+" "+data[i][j];
				row.add(item);
				list.add(row);
				
			}
			
		}
		
		
//		/*
//		 * 输出显示
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

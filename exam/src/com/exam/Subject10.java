package com.exam;
/**
 * 将"Hello one，Dream one。"取出指定字符串中的单词，前后交换，标点符号不变。
 * 结果为 One hello，One dream。
 * */
public class Subject10 {
	public static void main(String[] args) {
		String str="Hello one,Dream one。";
		char[] items=str.toCharArray();
		int offset=0;
		boolean ifInsr=false;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<items.length;i++){
			if(items[i]==','){
				ifInsr=false;
				offset=i+1;
			}
			if(items[i]=='。'){
				ifInsr=false;
			}
			if(items[i]==' '){
				items[offset]=(char)((int)items[offset]+32);
				sb.setCharAt(offset, items[offset]);
				items[i+1]=(char)((int)items[i+1]-32);
				//System.out.println(items[offset]);
				ifInsr=true;
			}
			if(ifInsr){
				sb.insert(offset, items[i]);
				if(items[i]!=' '){
					offset++;
				}
				
				
			}else{
				sb.append(items[i]);
			}
		}
		
		
		System.out.println(sb.toString());
		
		
	}
}

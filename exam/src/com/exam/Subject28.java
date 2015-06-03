package com.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * ���֤���������15λ����18λ�����һλ��������ĸ�����д������֤���֤�������ȷ�ԡ������ȷ������ȡ�������ڡ�
 * ���룺���֤����
 * 18λ��7-14�ǳ�������
 * 15λ��7-12λ����������
 * �����
 *������ȷ������TRUE+****��**��**�ա�
 *��������ȷ������FALSE��+����ԭ��
 * @author Administrator
 *
 */
public class Subject28 {

	/**
	 * @param args
	 */
	public static boolean checkIdentity(String id){
		
		String ckNum="0123456789";
		String ckEndNum="0123456789abcdefghjklmnopqistuwvyzx";
		if(id.length()!=18&&id.length()!=15){
			return false;
		}
		for(int i=0;i<id.length()-1;i++){
			if(ckNum.indexOf(id.charAt(i))==-1){
				return false;
			}
		}
		if(ckEndNum.indexOf(id.toLowerCase().charAt(id.length()-1))==-1){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String identity="370613198202121637";
		SimpleDateFormat format2=new SimpleDateFormat("yyyy��MM��dd��");
		boolean ret=checkIdentity(identity);
		if(ret){
			String sdate="";
			SimpleDateFormat format1=null;
			if(identity.length()==15){
				sdate=identity.substring(6, 12);
				format1=new SimpleDateFormat("yyMMdd");
			}else if(identity.length()==18){
				sdate=identity.substring(6,14);
				format1=new SimpleDateFormat("yyyyMMdd");
			}
			try {
				Date birthday=format1.parse(sdate);
				System.out.println("true"+format2.format(birthday));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("false�������ڴ���");
			}
			
		}
	
		
		
	}

}

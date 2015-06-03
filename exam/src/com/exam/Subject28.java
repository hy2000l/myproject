package com.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * 身份证号码可以是15位或者18位。最后一位可以是字母。请编写程序验证身份证号码的正确性。如果正确，则提取出生日期。
 * 输入：身份证号码
 * 18位：7-14是出生日期
 * 15位：7-12位出生年月日
 * 输出：
 *（若正确）：“TRUE+****年**月**日”
 *（若不正确）：“FALSE”+错误原因
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
		SimpleDateFormat format2=new SimpleDateFormat("yyyy年MM月dd日");
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
				System.out.println("false出生日期错误");
			}
			
		}
	
		
		
	}

}

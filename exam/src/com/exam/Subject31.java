package com.exam;

/**
 * ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
 * �ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ�
 * �������ҳ��������ֵ�������
 * @author Administrator
 *
 */
public class Subject31 {
	public static void main(String[] args) {
		String[] team1={"a","b","c"};
		String[] team2={"x","y","z"};
		for(int i=0;i<team1.length;i++){
			for(int j=0;j<team2.length;j++){
				if(team1[i].equals("a")&&(team2[j].equals("x")||team2[j].equals("y"))){
						continue;
				}else if(team1[i].equals("c")&&(team2[j].equals("x")||team2[j].equals("z"))){
						continue;
				}else if(team1[i].equals("b")&&(team2[j].equals("z")||team2[j].equals("y"))){
					continue;
				}
				System.out.println(team1[i]+"---"+team2[j]);
			}
			
		}
	}
	
}

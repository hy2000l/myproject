package com.exam;
/**
 * 	有4张红色的牌和4张蓝色的牌，主持人先拿任意两张，再分别在A、B、C三人额头上贴任意两张牌，
	A、B、C三人都可以看见其余两人额头上的牌，看完后让他们猜自己额头上是什么颜色的牌，
	A说不知道，B说不知道，C说不知道，然后A说知道了。
	请教如何推理，A是怎么知道的。
	如果用程序，又怎么实现呢？
 * @author Administrator
 *
 */
public class Subject35 {
	public static void main(String[] args) {
		int[] card={1,1,1,1,0,0,0,0};
		//取出可能组合  1,1  1,0  0,0
		//1,1
		//B 若是 1,1  C 是 0,0  A 0,0
		//B 若是 1,0  C 可以是1,0  则  A 0,0
					// c :0,0  则  A 1,0
		//B 若是0,0 C 1,1  A 0,0
					//C 1,0  A 1,0
		//1,0
		//B 若是 1,1  C 1,0  A 0,0
				    // C 0,0 A 1,0
		  //B 1,0    C 1,1  A 0,0
				   // C 0,0  A 1,1
				   // C 1,0  A 1,0
		//B 0,0
		  
	}
}

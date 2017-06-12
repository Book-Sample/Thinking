package com.mcivicm.thinkinjava.four;
/**
 * new关键字实例化顺序
 * 1. 静态字段
 * 2. 静态代码块
 * 3. 实例字段
 * 4. 实例代码块
 * 5. 构造函数
 * @author zlb
 *
 */
public class Mugs {
	static Mug c0 = new Mug(0);//1.静态字段
	static Mug c3;

	static {
		c3 = new Mug(3);//2.静态块
	}

	Mug c1;
	Mug c2;
	Mug c4 = new Mug(4);//3.实例字段
	
	{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");//4.实例代码块
	}

	Mugs() {
		System.out.println("Mugs()");//5.构造函数
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Mugs x = new Mugs();
	}

}

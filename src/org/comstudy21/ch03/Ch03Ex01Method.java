package org.comstudy21.ch03;

public class Ch03Ex01Method {
	
	static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
	}

	public static void main(String[] args) {
		System.out.println("call by value example");
		
		int a=100;
		int b=200;
		
		swap(a, b);
		System.out.println("a:"+a+", b:"+b);
	}
}

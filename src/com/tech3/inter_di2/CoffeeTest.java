package com.tech3.inter_di2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		HotAmericano hot=new HotAmericano();
		IceAmericano ice=new IceAmericano();
		Coffee coffee = new Coffee(hot); // 커피의 생성자 호출
		
		coffee.coffeeType();
	}
}

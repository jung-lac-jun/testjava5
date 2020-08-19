package com.tech3.inter_di1;

public class Coffee {

//	private HotAmericano ame;
    private IceAmericano ame;
	// 커피에 기본 생성자를 만들어보시오.
	public Coffee() {
//		System.out.println("호출하였습니까?");
//		ame=new HotAmericano();
		ame=new IceAmericano();
//		System.out.println(ame);
	}
	
	public void coffeeType() {
	System.out.println(ame.getName());
}
}
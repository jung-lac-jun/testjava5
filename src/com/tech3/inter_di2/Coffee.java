package com.tech3.inter_di2;

public class Coffee {


	
	private Americano americano;
	
	public Coffee(Americano ame) { //�ܺο��� ����
		ame=new IceAmericano();
		americano=ame;
	}
	
	public void coffeeType() {
	System.out.println(americano.getName());
}
}
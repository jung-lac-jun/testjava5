package com.tech1.trans;

public abstract class TransTest {

	public static void PrintCharge(Trans tran) {

	System.out.println(tran.toString());
	System.out.println(tran.toString());
	System.out.println(tran.toString());
	System.out.println(tran.getCharge());
	}
	public static void main(String[] args) {
		
		Trans[] trans=new Trans[4];
		trans[0]=new Train(5,100,200);
		trans[1]=new Express(5,100,100);
		trans[2]=new Taxi(5,10,500);
		trans[3]=new Train(1,100,200);
		//for each
//		for (Trans Tran : trans) {
//			PrintCharge(trans);
//		}
		for (int i = 0; i < trans.length; i++) {
			PrintCharge(trans[i]);
		}
		Express ex=new Express(1, 10, 100);
		System.out.println(ex.getCharge());
		System.out.println(ex.getCharge());
//PrintCharge(trans[0]); 
		
	}
}

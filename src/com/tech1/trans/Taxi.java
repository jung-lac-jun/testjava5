package com.tech1.trans;

public class Taxi extends Trans{
	private int xDan;
	public Taxi(int cusCnt, int dis, int xDan) {
		
		super(cusCnt, dis);
		// TODO �ڵ� ������ ������ ����
		this.xDan=xDan;
	}

	@Override
	public int getCharge() {
		// TODO �ڵ� ������ �޼ҵ� ����
		return cusCnt*dis*xDan;
	

	}
}
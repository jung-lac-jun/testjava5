package com.tech1.trans;

public class Train extends Trans{
	private int tDan;
	public Train(int cusCnt, int dis, int tDan) {
		
		super(cusCnt, dis);
		// TODO �ڵ� ������ ������ ����
		this.tDan=tDan;
	}

	@Override
	public int getCharge() {
		// TODO �ڵ� ������ �޼ҵ� ����
		return cusCnt*dis*tDan;
	

	}
}
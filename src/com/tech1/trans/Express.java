package com.tech1.trans;

public class Express extends Trans implements Start,End {
	private int eDan;
	public Express(int cusCnt, int dis, int eDan) {
		
		super(cusCnt, dis);
		// TODO �ڵ� ������ ������ ����
		this.eDan=eDan;
	}

	@Override
	public int getCharge() {
		// TODO �ڵ� ������ �޼ҵ� ����
		return cusCnt*dis*eDan;
	

	}

	@Override
	public String getStartStation() {
		// TODO �ڵ� ������ �޼ҵ� ����
		return "����";
	}

	@Override
	public String getEndStation() {
		// TODO �ڵ� ������ �޼ҵ� ����
		return "�λ�";
	}
}
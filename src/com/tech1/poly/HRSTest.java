package com.tech1.poly;

public class HRSTest {
	public static void calTax(Object s) { // �پ缺�� �ڵ�
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�ҵ漼�� ����մϴ�.");
	}

	public String Consultant;
	public String Salesman;
	public String Director;
	
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();

		Object arr[] = new Object[3];
		arr[0] = s;
		arr[1] = c;
		arr[2] = d;
/*		
		calTax(arr[0]);
		calTax(arr[1]);
		calTax(arr[2]);
*/
		for (Object object : arr) {
			calTax(object);
		}
	
		
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
				
		
		/*
		 * System.out.println(s.toString()); System.out.println(c.toString());
		 * System.out.println(d.toString());
		 * 
		 * Salesman s2 = s; if (s.equals(s2)) { System.out.println("����"); }else {
		 * System.out.println("����ġ"); }
		 */
	}

	private static void calcTax(Object object) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}

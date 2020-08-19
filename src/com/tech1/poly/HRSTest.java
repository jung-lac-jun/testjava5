package com.tech1.poly;

public class HRSTest {
	public static void calTax(Object s) { // 다양성의 코드
		// TODO 자동 생성된 메소드 스텁
		System.out.println("소득세를 계산합니다.");
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
		 * Salesman s2 = s; if (s.equals(s2)) { System.out.println("동일"); }else {
		 * System.out.println("불일치"); }
		 */
	}

	private static void calcTax(Object object) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}

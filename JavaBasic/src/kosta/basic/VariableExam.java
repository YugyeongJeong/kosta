package kosta.basic;

public class VariableExam {

	public static void main(String[] args) {
		
		String n3 = 10 + 5 + "0";	
		System.out.println(n3);
		
		String n4 = 7 + "4" + 9;
		System.out.println(n4);
		
		int n5 = Integer.parseInt(n4);
		int re3 = n5 + 1;
		System.out.println(re3);
		
		String name = "admin ";
		// trim() 공백 지움
		if( name.trim().equals("admin"))
			System.out.println("관리자");
		else
			System.out.println("일반인");
		
		int a = 20;
		int b = 15;
		int c = 5;
		int max = 0;
		
		if( a > max) max = a;
		if (b > max) max = b;
		if( c > max) max = c;
			
		System.out.println(max);
		
	}

}

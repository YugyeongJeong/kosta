package kosta.oop2;

public class Main {
	
	public static void main(String args[]) {
		
		Role r = new Role() {
			
			@Override
			public void doIt() {
				System.out.println("열심히 공부하는 학생");
			}
		};
		
		Role role = new Driver();
		Person p = new Person("홍길동", r);
	}

}

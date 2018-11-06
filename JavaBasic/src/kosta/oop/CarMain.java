package kosta.oop;

public class CarMain {

	public static void main(String args[]) {
		
		Car c = new Car();
		
		c.speed = 80;
		c.speedUp(10);
		c.speedDown(5);
		
		System.out.println("현재 속도 : " + c.speed);
		
	}
}

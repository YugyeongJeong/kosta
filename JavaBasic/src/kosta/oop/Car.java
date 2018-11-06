package kosta.oop;

public class Car {
	
	int speed;
	
	int speedUp (int s) {
		
		return speed += s;
	}
	
	int speedDown(int s) {
		
		if(s < speed) 
			speed -= s;
		
		return speed;
		
	}

}

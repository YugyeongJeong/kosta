package kosta.speak;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
	} 
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " 열심히 해야 한다.");
	}

}

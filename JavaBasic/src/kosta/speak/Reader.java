package kosta.speak;

public class Reader extends Man implements Speakable {
	
	public Reader(String name) {
		super(name);
	} 

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " 자바 화이팅!");
	}

}

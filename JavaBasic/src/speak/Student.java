package speak;

public class Student extends Man {

	public Student(String name) {
		super(name);
	} 
	
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " 공부나 열심히해!");
	}

}

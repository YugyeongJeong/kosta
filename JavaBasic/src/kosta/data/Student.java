package kosta.data;

public class Student {
	
	private String name;
	private float kor;
	private float eng;
	private float mat;
	private float sum;
	private float avg;
	
	public Student() {}
	
	public Student(String name, float kor, float eng, float mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum += (kor + eng + mat);
		this.avg = sum / 3.0f;
	}
	
	
	

}

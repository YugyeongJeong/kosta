package kosta.student;

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
	}

	public Student(String name, float kor, float eng, float mat, float sum, float avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getKor() {
		return kor;
	}

	public void setKor(float kor) {
		this.kor = kor;
	}

	public float getEng() {
		return eng;
	}

	public void setEng(float eng) {
		this.eng = eng;
	}

	public float getMat() {
		return mat;
	}

	public void setMat(float mat) {
		this.mat = mat;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

}

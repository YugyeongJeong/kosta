package kosta.student;

public class StudentManager {

	private String subjects[] = { "성명", "국어", "영어", "수학", "총점", "평균" };
	private Student[] students;
	//private Scanner sc = new Scanner(System.in);
	
	public StudentManager() {

		students = new Student[10];
		for(int i = 0; i < 10; i++)
			students[i] = new Student();

	}

	public void inputData(int idx) {
		
		System.out.print("이름 입력 : ");
		students[idx].setName(DataInput.sc.nextLine());
		System.out.print("국어 입력 : ");
		students[idx].setKor(DataInput.sc.nextFloat());
		System.out.print("영어 입력 : ");
		students[idx].setEng(DataInput.sc.nextFloat());
		System.out.print("수학 입력 : ");
		students[idx].setMat(DataInput.sc.nextFloat());
		DataInput.sc.nextLine();
		students[idx].setSum(students[idx].getKor() + students[idx].getEng() + students[idx].getMat());
		students[idx].setAvg(students[idx].getSum() / 3.0f);

	}

	public void swap(Student[] scores, int idx1, int idx2) {

		Student temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;

	}

	public void sort() {

		for (int i = 0; i < StudentMain.cnt - 1; i++)
			for (int j = i + 1; j < StudentMain.cnt; j++)
				if (students[i] != null && students[i].getAvg() < students[j].getAvg())
					swap(students, i, j);

	}

	public void printTitles() {

		for (int i = 0; i < subjects.length; i++)
			System.out.print(subjects[i] + "\t");
		System.out.println();

	}

	public void outputData(int i) {

		if (students[i] == null) return;

		System.out.print(students[i].getName() + "\t");
		System.out.print(students[i].getKor() + "\t");
		System.out.print(students[i].getEng() + "\t");
		System.out.print(students[i].getMat() + "\t");
		System.out.print(students[i].getSum() + "\t");
		System.out.print(students[i].getAvg() + "\n");

	}

	public int searchData() {

		int i;

		System.out.print("성명 입력 : ");
		String name = DataInput.sc.nextLine();

		for (i = 0; i < StudentMain.cnt; i++)
			if (students[i] != null && students[i].getName().equals(name.trim()))
				break;

		return i;

	}
	
	public void deleteData(int idx) {

		students[idx] = null;

	}
	
	public void updateData(int idx) {

		inputData(idx);

	}

}

package kosta.student;

public class StudentMain {
	
	static int cnt;
	
	public static void main(String args[]) {
		
		StudentManager man = new StudentManager();
		//Scanner sc = new Scanner(System.in);
		int menu = -1;
		int idx;
		
		while ( menu != 0 ) {
			System.out.println("================================");
			System.out.println("1.추가, 2.전체출력, 3.검색, 4.삭제, 5.수정, 0.종료");
			System.out.print("입력 : ");
			menu = DataInput.sc.nextInt();
			DataInput.sc.nextLine();
			
			switch (menu) {
			case 1:
				System.out.println("=============추가 선택=============");
				man.inputData(cnt++);
				break;
			case 2:
				System.out.println("=============출력 선택=============");
				man.sort();
				man.printTitles();
				for (int i = 0; i < cnt; i++)
					man.outputData(i);
				break;
			case 3:
				System.out.println("=============검색 선택=============");
				idx = man.searchData();
				man.printTitles();
				man.outputData(idx);
				break;
			case 4:
				System.out.println("=============삭제 선택=============");
				idx = man.searchData();
				man.deleteData(idx);
				break;
			case 5:
				System.out.println("=============수정 선택=============");
				idx = man.searchData();
				man.updateData(idx);
				break;
			case 0:
				System.out.println("============프로그램 종료============");
				return;
			}
		}
	}

}

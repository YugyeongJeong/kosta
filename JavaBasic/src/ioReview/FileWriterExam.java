package ioReview;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String str = "";
		String poem = "";
		try {
			System.out.print("입력 : ");
			while(true) {
				str = sc.nextLine();
				if(str.equals("Q")) break;
				poem += str;
				poem += "\n";
			}
			fw = new FileWriter("output02.txt");
			fw.write(poem);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

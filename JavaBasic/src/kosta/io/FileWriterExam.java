package kosta.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = "";
		String poem = "";
		
		while(true){
			str = sc.nextLine();
			if(str.equals("Q")) break;
			poem += str;
			poem += "\n";
		}
		
	 try {
		writer = new FileWriter("poem2.txt");
		writer.write(poem);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}

}

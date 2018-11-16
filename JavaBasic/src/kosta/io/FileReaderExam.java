package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) {
		
		FileReader reader = null;
		char arr[] = new char[50];
		
		try {
			reader = new FileReader("poem.txt");
			/*while(true) {
				int data = reader.read();
				if(data == -1) break;
				char ch = (char)data;
				System.out.print(ch);
			}*/
			reader.read(arr);
			System.out.print(arr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

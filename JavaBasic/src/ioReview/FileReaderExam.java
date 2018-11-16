package ioReview;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {
		FileReader fr = null;
		String str="";
		
		try {
			fr = new FileReader("poem.txt");
			while(true){
				int data = fr.read();
				if(data == -1) break;
				str += (char)data;
			}
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

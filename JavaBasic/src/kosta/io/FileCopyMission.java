package kosta.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyMission {
	
	public static void main(String args[]) {
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			
			reader = new FileReader("poem.txt");
			writer = new FileWriter("poem_copy.txt");
			int data = 0;
			String str = "";
			
			while(data != -1) {
				data = reader.read();
				str += (char)data;
			}
			
			writer.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

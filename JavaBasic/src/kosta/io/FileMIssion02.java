package kosta.io;

import java.io.File;

public class FileMIssion02 {

	public static void main(String[] args) {
	
		String source = "C:\\Users\\kosta\\Desktop\\new";
		String dest = "C:\\Users\\kosta\\Desktop\\new02";
		
		CopyUtil cu = new CopyUtil();
		
		try {
			cu.copy(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
	}

}

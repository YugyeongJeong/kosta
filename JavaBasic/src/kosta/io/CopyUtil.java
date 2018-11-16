package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyUtil {
	
	public static void copy(String srcPath, String destPath) throws Exception{
		
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		
		if(!srcFile.exists())
			throw new Exception("대상이 존재하지 않습니다.");
		else if(srcFile.isDirectory())
			copyDirectory(srcFile, destFile);
		
	}
	
	public static void copyDirectory(File source, File dest) throws Exception {
		
		File arr[] = source.listFiles();
		dest.mkdir();

		for (int i = 0; i < arr.length; i++) {
			File d = new File(dest,  arr[i].getName());
			if(arr[i].isFile()) copyFile(arr[i], d);
			else copyDirectory(arr[i], d);
		}
	}

	public static void copyFile(File source, File dest) throws Exception {

		byte[] bSource = new byte[(int) source.length()];
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);

			fis.read(bSource);
			fos.write(bSource);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}

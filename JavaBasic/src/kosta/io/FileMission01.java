package kosta.io;

import java.io.File;
import java.util.GregorianCalendar;

public class FileMission01 {
	// **** A 디렉토리 *******
	// -a파일
	// -b

	static String path = "C:\\Users\\kosta\\Documents";

	public static void getFile(int cnt, File arr[], String depth) {
		
		String name = arr[cnt].getName();
		if (arr[cnt].isFile())
			System.out.printf("%s%-25s %7d", depth, name, arr[cnt].length());
		else
			System.out.printf("%s%-25s <DIR>", depth, name);
		long time = arr[cnt].lastModified();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(time);
		System.out.printf("%1$tF %1$tT %n", calendar);
		
	}
	public static void getInfo(String path, String d) {
		String depth = d;
		File file = new File(path);
		File arr[] = file.listFiles();

		if (arr == null) return;
		for (int cnt = 0; cnt < arr.length; cnt++) {
			//String name = arr[cnt].getName();

			if (arr[cnt].isFile())
				getFile(cnt, arr, depth);
			else {
				getFile(cnt, arr, depth);
				getInfo(path + "\\" + arr[cnt].getName(), depth + "-");
			}
		}

	}

	public static void main(String[] args) {

		getInfo(path, "");

	}

}

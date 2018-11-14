package kosta.api;

public class StringExam {

	public static void main(String[] args) {

		String str = "ABC";
		String str2 = new String("ABC");

		// String 불변성
		String str3 = str.concat("DEF");
		System.out.println(str3);

		
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);

		String sql = "select * from board";

		int num = 10;
		if (num == 10)
			sql += " where num = 10";
		System.out.println(sql);
		System.out.println(sql.indexOf("l"));
		System.out.println(sql.length());

		int start = sql.indexOf("board");
		int end = start + "board".length();
		System.out.println(sql.substring(start, end));
		
		String fileName = "C:/Users/kosta/Pictures/gongyu01.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1);
		
		System.out.println(head);
		System.out.println(pattern);
		
		String id = "kosta";
		String m_id = "kosta ";
		
		if(id.trim().equals(m_id.trim()))
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		String fruits = "사과, 배, 포도, 수박";
		String arr[] = fruits.split(",");
		for(String s : arr)
			System.out.println(s.trim());
		
		int n = 100;
		String s = n + "";
		
		if(fileName.endsWith("jpg") || fileName.endsWith("png"))
			System.out.println("이미지 파일");
		
		String path = "C:/Users/kosta/Pictures/gongyu01.jpg";
		String paths[] = path.split("/");
		String fileInfo = paths[paths.length-1];
//		String filename[] = fileInfo.split(".");
		String small = fileInfo.substring(0, fileInfo.indexOf(".")) + 
				"_small" + fileInfo.substring(fileInfo.indexOf("."));
		System.out.println(small);

	}

}

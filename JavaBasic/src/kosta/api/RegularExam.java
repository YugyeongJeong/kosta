package kosta.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		//String str = sc.nextLine();
		String str01 = "dolsam77@nate.com";
		String str02 = "34dolsam77@nate.com";
		String str03 =  "dolsam77nate.com";
		String str04 =  "dolsam77@nate.comcom";
		String str05 = "Hello java World";

		//"[a-zA-Z]{6}+[\\d]{2,}+@[a-zA-Z]{4,}+(.[a-zA-Z]{3}+)*$"
		//abc 문자 포함
		if(str03.matches("^\\D\\w+@\\w+\\.\\w{2,3}$"))
			System.out.println("매칭");
		else
			System.out.println("비매칭");
		
		
		String[] files = {"abc.jpg", "abc.GIF", "abc.png", "eng.txt", "eng.pdf", "eroojpg"};
		for(String s : files) {
			if(s.matches("\\w+\\.(?i)(jpg|gif|png)"))
				System.out.println("이미지파일");
			else
				System.out.println("비매칭");
		}*/
		
		String str = "SW 개발자123 처우와 근무여건 선진국 수준으로 개선해야 SW";
		String result = str.replaceAll("SW", "소프트웨어");
		result = result.replaceAll("[0-9]", "");
		System.out.println(result);

	}

}

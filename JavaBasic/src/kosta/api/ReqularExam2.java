package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqularExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa", "c"
		};
		
		Pattern p = Pattern.compile("c[a-z]*");
		for(int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i]);
			
		}
		
		String source = "abc?def?gh";
		String pattern = "(\\w)+";
		
		Pattern pattern2 = Pattern.compile(pattern);
		Matcher matcher2 = pattern2.matcher(source);
		while(matcher2.find())
			System.out.println(matcher2.group());
		*/
		
		String source3 = "HP : 010-1111-2222, Home : 02-222-2222";
		String pattern3 = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
		
		Pattern p3 = Pattern.compile(pattern3);
		Matcher matcher3 = p3.matcher(source3);
		while(matcher3.find())
			System.out.println(matcher3.group());
		
	}

}

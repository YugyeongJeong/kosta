package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String args[]) {
		
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		String now =gc.get(Calendar.YEAR) + "년 " 
							+ (gc.get(Calendar.MONTH)+1) + "월 "
							+ gc.get(Calendar.DATE) + "일 "
							+ gc.get(Calendar.HOUR) + "시 "
							+ gc.get(Calendar.MINUTE) + "분";
		
		System.out.println("현재시간 : " + now);
		
		gc.add(Calendar.DATE, 100);
		String future =gc.get(Calendar.YEAR) + "년 " 
				+ (gc.get(Calendar.MONTH)+1) + "월 "
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분";
		System.out.println("100일 후 : " + future);
		
		// 첫만남 2018/08/13
		gc.set(2018, 8, 13);
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		String str = dateFormat.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		for(int i = 2018; i < 2028; i++) {
			gc.set(i, 1, 18);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i + "년의 나의 생일은 " + c + "요일 입니다.");
		}
	}
}


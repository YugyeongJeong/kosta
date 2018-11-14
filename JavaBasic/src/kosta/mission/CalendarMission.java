package kosta.mission;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar gc = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int m = sc.nextInt();
		gc.set(2018, m-1, 1);
		
		int n = gc.getActualMaximum(Calendar.DATE);
		int d = gc.get(Calendar.DAY_OF_WEEK) -1;

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1; i <=d; i++)
			System.out.print("\t");
		
		for(int i = 1; i <= gc.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i + "\t");
			if((d + i)%7 == 0)
				System.out.println();
		}
		System.out.println();

		for (int i = 0; i <= n / 7 + 1; i++) {
			for (int j = 1; j <= 7; j++) {
				int date = i * 7 + j - d;
				if (date <= 0) 
					System.out.print("\t");
				else if (date <= n)
					System.out.print(date + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= n / 7 + 1; i++) {
			for (int j = 1; j <= 7; j++) {
				
			}
		}
			
	}
}

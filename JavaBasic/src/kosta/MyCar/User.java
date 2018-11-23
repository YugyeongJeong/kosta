package kosta.MyCar;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	static ArrayList<Fuel> fuels = new ArrayList<>();	//Fuel ArrayList fuels 객체 생성
	static MyCar my = new MyCar();						//MyCar my 객체 생성
	static double b;

	static double totalEfficiency = 0;		//총연비 넣을 static변수
	static double countEfficiency = 0;		//카운트

	static int totalPrice = 0;		//총금액
	static int totRun = 0;			//총 주행거리

	public void input() {
		my.input();		//my객체를 통해 input()메소드 호출하여 차 정보 입력
	}

	public void record() {
		Scanner sc = new Scanner(System.in);

		if (fuels.isEmpty()) {					//fuels배열리스트가 비어있다면
			System.out.println("주유 기록이 없습니다.");
		} else {								//비어있지 않다면
			for (int i = 0; i < fuels.size(); i++)
				fuels.get(i).print();			//print()메소드를 이용하여 fuel리스트의 값 출력
		}
		while (true) {
			System.out.println("주유 기록을 추가 하시겠습니까? 1.추가 2.나가기 ");
			System.out.print("메뉴입력 : ");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 1) {						//a값이 1이라면
				Fuel fuel = new Fuel();			//fuel객체 생성
				do {
					fuel.input();			//input()메소드로 주유기록 입력
				} while (my.getFuelTank() < fuel.getAfterQuantity() || my.getFuelTank() < fuel.getBeforeQuantity());	//전후 주유량이 주유탱크 용량을 넘으면 반복 실행
				fuels.add(fuel);			//fuel값을 fuels객체에 add
			} else
				break;
		}
	}

	public void fragEff() {					
		if (fuels.size() < 2) {			//fuels리스트 길이가 2개미만이면 
			System.out.println("최신 구간연비를 알 수 없습니다. 주유기록을 추가하십시오. ");

		} else {
			avgEff();					//최신구간 연비 구하는 메소드 호출
			System.out.println(
					fuels.get(fuels.size() - 2).getCal() + "~" + fuels.get(fuels.size() - 1).getCal() + "의 최신 구간연비는 " + (Math.round(b*100)/100.0));
		}			//최신 전 주유날짜 ~ 최신 주유날짜의 연비출력
	}

	public static void avgEff() {
		b = (double) (fuels.get(fuels.size() - 1).getRun() - fuels.get(fuels.size() - 2).getRun())	//연비 = 주행거리/주유소모량
				/ (double) ((fuels.get(fuels.size() - 2).getAfterQuantity()							//주행거리 : 최신 총 주행거리 - 바로전 총 주행거리
						- fuels.get(fuels.size() - 1).getBeforeQuantity()));						//주유소모량 : 이전 후 주유량 - 최신 전 주유량
	}

	public static void statis() {
		Scanner sc = new Scanner(System.in);

		ArrayList<Fuel> mFuels = new ArrayList<>();			//mFuels배열리스트 객체 생성

		if (fuels.size() == 0) {							//fuels리스트 수가 없다면
			System.out.println("월통계를 알 수 없습니다. 주유기록을 추가하십시오. ");
		} else {
			System.out.print("조회하고 싶은 월을 입력하세요 : ");
			String mon = sc.nextLine();

			for (int i = 0; i < fuels.size(); i++) {			
				String temp = fuels.get(i).getCal().substring(4, 6); //fuels의 날짜정보중 인덱스 5~7번째 스트링을 받는다. - 인덱스는 0이 1번째
				if (mon.equals(temp)) {					//입력받은 월값과 fuels월값이 같다면
					mFuels.add(fuels.get(i));			//mFuels리스트 안에 fuels정보 add
				}
			}

			if (mFuels.size() < 2)					//mFuels리스트가 없다면
				System.out.println("월통계를 알 수 없습니다. 주유기록을 추가하십시오. ");
			else {
				for (int i = 1; i < mFuels.size(); i++) {
					totalEfficiency += calcEfficiency(mFuels.get(i-1), mFuels.get(i));	//calcEfficiency메소드에서 계산된 연비값으로 총연비 계산
					countEfficiency++;		//입력값 카운트 +1				
				}

			}

			// 총 주유비
			for (int i = 0; i < fuels.size(); i++) {	
				int price = fuels.get(i).getPrice();	//fuels size만큼의 주유비를 받아

				totalPrice += price;			//totalPrice에 총 주유비 합산

			}

			for (int i = 1; i < fuels.size(); i++) {
				int step = fuels.get(i).getRun() - fuels.get(i - 1).getRun();	//이후 총 주행거리에서 이전 총 주행거리를 빼서 구간별 주행거리를 받아

				totRun += step;				//totRun에 총 주행거리 합산
			}

			System.out.println(mon + "월 평균 연비는 " + (Math.round(totalEfficiency / countEfficiency*100)/100.0 + "Km/L"));	//총연비/카운트수로 평균연비 계산 //Math.round와 *100/100연산을 통해 소수점 둘째자리만 출력
			System.out.println(mon + "월 총 주유비는 " + totalPrice + "원입니다.");
			System.out.println(mon + "월 총 주행거리는 " + totRun + "Km입니다.");

		}
	}

	public static double calcEfficiency(Fuel before, Fuel after) {	//매개변수로 이전값과 나중값을 받는다.
		double eff = (double) (after.getRun() - before.getRun())	//나중 주행거리에서 이전 주행거리르 뺀값 - 이전 후 주유량에서 나중 전 주유량 뺀값을 계산하면 구간 평균연비가 계산된다.
				/ (double) (before.getAfterQuantity() - after.getBeforeQuantity());
		return eff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

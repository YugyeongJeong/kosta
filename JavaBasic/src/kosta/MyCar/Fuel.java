package kosta.MyCar;

import java.util.Scanner;

public class Fuel {

	private String cal;				//주유 날짜
	private int beforeQuantity;		//전 주유량
	private int afterQuantity;		//후 주유량
	private int price;				//주유비
	private int run;				//주행 거리

	public Fuel() {					//디폴트 생성자
	}

	public Fuel(String cal, int beforeQuantity, int afterQuantity, int price, int run) {	//생성자
		super();
		this.cal = cal;
		this.beforeQuantity = beforeQuantity;
		this.afterQuantity = afterQuantity;
		this.price = price;
		this.run = run;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("날짜 입력 : ");
		cal = sc.nextLine();
		System.out.print("주유 전 주유량 입력 : ");
		beforeQuantity = sc.nextInt();
		System.out.print("주유 후 주유량 입력 : ");
		afterQuantity = sc.nextInt();
		System.out.print("주유비 입력 : ");
		price = sc.nextInt();
		System.out.print("총 주행거리 입력 : ");
		run = sc.nextInt();
	}

	public void print() {

		System.out.println("주유 날짜 : " + cal +"\t"+ "전 주유량 : " + beforeQuantity +"\t"+"후 주유량 : " + afterQuantity + "\t" +" 주유비 : "
				+ price + "\t" +" 총 주행거리 : " + run);

	}

	public String getCal() {
		return cal;
	}

	public void setCal(String cal) {
		this.cal = cal;
	}

	public int getBeforeQuantity() {
		return beforeQuantity;
	}

	public void setBeforeQuantity(int beforeQuantity) {
		this.beforeQuantity = beforeQuantity;
	}

	public int getAfterQuantity() {
		return afterQuantity;
	}

	public void setAfterQuantity(int afterQuantity) {
		this.afterQuantity = afterQuantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

}
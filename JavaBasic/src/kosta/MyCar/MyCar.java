package kosta.MyCar;

import java.util.Scanner;

public class MyCar {

	private String carName;		//차종:
	private String fuelSort;	//연료 종류
	private int fuelTank;		//연료탱크 용량
	private int old;			//연식
	private double eff;			//연비
	private int displacement;	//배기량

	public MyCar() {		//디폴트생성자
	}

	public MyCar(String carName, String fuelSort, int fuelTank, int old, double eff, int displacement) {
		super();
		this.carName = carName;
		this.fuelSort = fuelSort;
		this.fuelTank = fuelTank;
		this.old = old;
		this.eff = eff;
		this.displacement = displacement;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getFuelSort() {
		return fuelSort;
	}

	public void setFuelSort(String fuelSort) {
		this.fuelSort = fuelSort;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public double getEff() {
		return eff;
	}

	public void setEff(double eff) {
		this.eff = eff;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public void input() {

		System.out.println("-----------------자동차 정보 입력-----------------");
		Scanner sc = new Scanner(System.in);

		System.out.print("차종 : ");
		carName = sc.nextLine();
		System.out.print("연료 종류 : ");
		fuelSort = sc.nextLine();
		System.out.print("연료 탱크 용량(L) : ");
		fuelTank = sc.nextInt();
		System.out.print("연식(년) : ");
		old = sc.nextInt();
		System.out.print("연비(Km/L) : " );
		eff = sc.nextDouble();
		System.out.print("배기량(cc) : " );
		eff = sc.nextInt();

	}
}
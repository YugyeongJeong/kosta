package kosta.oop;

public class Book {

	String name;
	int price;
	float discountedPrice;

	Book(String name, int price) {

		this.name = name;
		this.price = price;

	}

	void setiDscountedPrice() {

		this.discountedPrice = this.price;

		if (price >= 3000)
			discountedPrice *= 0.75;
		else if (price >= 20000)
			discountedPrice *= 0.8;
		else
			discountedPrice *= 0.85;

	}

	void outputBook() {

		System.out.println(this.name + "교재의 정가는 " + this.price + "원 할인된 가격은 " 
		+ this.discountedPrice + "원 입니다.");

	}
}

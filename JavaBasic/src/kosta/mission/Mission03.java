package kosta.mission;

public class Mission03 {

	public static void main(String[] args) {

		int num = 12345;
		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 10000; i *= 10)
			even += (num / i) % 2 == 0 ? 1 : 0;
		odd = 5 - even;

		System.out.println("홀수 : " + odd);
		System.out.println("짝수 : " + even);

	}

}

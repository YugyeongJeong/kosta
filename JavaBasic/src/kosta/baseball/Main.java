package kosta.baseball;

public class Main {

	public static void main(String args[]) {

		Player com = new Com();
		Player user = new User();
		Service sv = new Service();
		int count = 0;

		com.generate();

		while ( sv.getStrike() != 3 ) {
			user.generate();
			sv.calcScore(com, user);

			System.out.println(++count +"회 결과");
			System.out.println(sv.getStrike() + "스트라이크" + sv.getBall() + "볼");
		}

		System.out.println(count + "회 성공");
		
	}

}

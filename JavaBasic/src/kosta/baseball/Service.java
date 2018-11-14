package kosta.baseball;

public class Service {

	private int strike;
	private int ball;

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	void calcScore(Player p1, Player p2) {
		
		int p1Nums[] = p1.getNums();
		int p2Nums[] = p2.getNums();
		
		strike = ball = 0;
		for( int i = 0; i < p1Nums.length; i++ ) {
			for( int j = 0; j < p2Nums.length; j++ ) {
				if( p1Nums[i] == p2Nums[j] )
					if( i == j ) { strike++; break;}
					else { ball++; break; }
			}
		}
		
	}
}

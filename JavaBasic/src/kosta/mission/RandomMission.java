package kosta.mission;

import java.util.Random;

public class RandomMission {
	
	static int used[] = new int[9];
	
	public static void main(String args[]) {
		
		String cards[] = {"카드1", "카드2", "카드3", "카드4", "카드5", "카드6", "카드7", "카드8", "카드9"};
		String suffled[] = new String[9];
		
		Random r = new Random();

		for (int i = 0; i < cards.length; i++) {
			while (true) {
				int n = r.nextInt(9);
				if (used[n] != 1) {
					suffled[i] = cards[n];
					//System.out.println(suffled[i]);
					used[n] = 1;
					break;
				}
			}
		}		
		
		for(String s: suffled)
			System.out.println(s);
	}

}

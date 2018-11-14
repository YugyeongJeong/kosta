package kosta.baseball;

import java.util.Random;

public class Com extends Player {

	@Override
	public void generate() {

		int nums[] = new int[MAX];
		int used[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < getNums().length; i++) {
			while (true) {
				int n = r.nextInt(9) + 1;
				if (used[n] != 1) {
					nums[i] = n;
					used[n] = 1;
					break;
				}
			}
		}

		setNums(nums);
	}

}

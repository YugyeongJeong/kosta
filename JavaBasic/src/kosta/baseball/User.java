package kosta.baseball;

import java.util.Scanner;

public class User extends Player {

	@Override
	public void generate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 3자리의 수 입력");
		String str = sc.nextLine();
		int nums[] = new int[3];
		
		for(int i = 0; i < getNums().length; i++)
			nums[i] = str.charAt(i) - '0';
		
		setNums(nums);
		
	}
}

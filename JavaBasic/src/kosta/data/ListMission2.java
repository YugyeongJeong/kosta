package kosta.data;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListMission2 {

	private static int nums[] = new int[6];
	private static int used[] = new int[46];

	public static void main(String[] args) {

		Random r = new Random();
//
//		for (int i = 0; i < nums.length; i++) {
//			while (true) {
//				int n = r.nextInt(45) + 1;
//				if (used[n] != 1) {
//					nums[i] = n;
//					used[n] = 1;
//					break;
//				}
//			}
//		}
//		
//		for (int i : nums)
//			System.out.print(i + " ");
//	
//
//		List<Integer> list = new ArrayList<>();
//		while( list.size() != 6) {
//			int n = r.nextInt(45) + 1;
//			if(list.contains(n))
//				continue;
//			else
//				list.add(n);
//		}		
//		
//		for (Integer i : list)
//			System.out.print(i + " ");
		
		Set<Integer> set = new HashSet<>();
		
		while( set.size() != 6) { 
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
	
			System.out.print(set);

	}

}

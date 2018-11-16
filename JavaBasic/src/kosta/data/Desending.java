package kosta.data;

import java.util.Comparator;

public class Desending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		// 자리 바꾸고
		if(o1 < o2) return 1;
		// 바꾸지마
		else if(o1 > o2) return -1;
		
		return 0;
	}
	
}

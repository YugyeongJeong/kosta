package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// 정렬기준 재설정 => Comparator
		// 최초의 정렬기준 설정 => Comparable
		Random r = new Random();
		
		TreeSet<Integer> set = new TreeSet<>(new Desending());
		for(int i = 0; set.size()<6; i++) {
			int num = r.nextInt(45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		

	}

}

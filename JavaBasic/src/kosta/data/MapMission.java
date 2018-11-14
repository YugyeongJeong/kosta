package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 90);
		map.put("박자바", 80);
		
		// key값 추출
		Set<String> set = map.keySet();
		//Value 추출
		// Map => Collection => Itertator
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();

		int total = 0;
		while(iter.hasNext()) {
			int num = iter.next();
			total += num;
			
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / map.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
//		int sum = 0;
//		float avg;
//		
//		Map<String, Integer> scores = new HashMap<>();
//		scores.put("김자바", 90);
//		scores.put("박자바", 80);
//		
//		Set set = scores.entrySet();
//		Iterator iter = set.iterator();
//		Iterator<Integer> iValue = scores.values().iterator();
//
//		while(iter.hasNext()) {
		//이거 중요 대박중요
//			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)iter.next();
//			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
//		}
//		
//		int max = 0, min = 101;
//		while(iValue.hasNext()) {
//			int temp = iValue.next();
//			if(max < temp ) max = temp;
//			if(min > temp) min = temp;
//					
//			sum +=temp;
//		}
//		avg = sum / scores.size();
//		
//		System.out.println("합계 : " + sum + " 평균 : " + avg + " 최대 : " + max + " 최소 " + min);
	}
}

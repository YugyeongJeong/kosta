package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import kosta.student.Student;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "SK");
		map.put("2", "두산");
		map.put("3", "넥센");
		
		System.out.println("요소 갯수 : " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		
		System.out.println("요소 갯수 : " + map.size());
		
		//Map 전체내용 출력
		//Map => Set => Iterator
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		// 
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();
			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}
	}
	
}

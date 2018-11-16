package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍자바", 50));
		list.add(new Person("정자바", 80));
		list.add(new Person("한자바", 40));
		list.add(new Person("서자바", 100));
		list.add(new Person("김자바", 20));

		Collections.sort(list, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getName().compareTo(o2.getName()) > 0)
					return 1;
				else if(o1.getName().compareTo(o2.getName()) < 0)
					return -1;
				return 0;
			}
			
		});
		
		System.out.println(list);
	}

}

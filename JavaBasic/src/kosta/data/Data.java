package kosta.data;

import java.util.ArrayList;

public class Data {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("포도");          
		list.add("딸기");          
		list.add("복숭아");  
		
		for(String s : list) 
			System.out.println(s);

	}

}

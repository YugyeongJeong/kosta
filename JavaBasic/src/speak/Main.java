package speak;

public class Main {
	
	public static void main(String args[]) {
		
		Man objs [] = { new Reader("둘리"), new Work("길동"), new Student("마이콜")};
		
		for(int i = 0; i < objs.length; i++)
			if(objs[i] instanceof Speakable)
				((Speakable) objs[i]).speak();
	}

}

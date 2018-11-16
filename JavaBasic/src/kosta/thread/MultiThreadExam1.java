package kosta.thread;

public class MultiThreadExam1 {

	public static void main(String[] args) {
		
		Thread thread = new DigitThread();
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

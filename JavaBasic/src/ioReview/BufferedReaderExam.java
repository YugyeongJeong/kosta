package ioReview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderExam {

	public static void main(String[] args) {
		
		// 기존의 Scanner 객체를 이용하지 않고
		/*
		 * System.in = InputStream(노드 스트림, 바이트 스트림) => InputStreamReader(문자변환)
		* BufferedReader(System.in);
		 * */
		
		/* InputStream in = System.in; //키보드 입력
		 * InputStreamReader isr = new InputStreamReader(in); // 필터 스트림
		 * BufferedReader br = new BuffredReader(ist);
		 * 
		 * */
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("입력 : ");
			while( (str = br.readLine()) != null) {
				str += "\n";
			}
			bw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		

	}

}

package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
	Member m;

	public void read() {
		ObjectInputStream ois = null;
		try {
			// 역직렬화 - 파일에 있는 데이터를 객체에 쓴다
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}

	public void write() {
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null;

		try {
			// 직렬화 - 파일에 객체를 쓰겠다
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {

		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}

		}

	}

	public static void main(String args[]) {

		SerialExam se = new SerialExam();

		se.write();
		se.m = null;
		se.read();

		System.out.println(se.m);
	}

}

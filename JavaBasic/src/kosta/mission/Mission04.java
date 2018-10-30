package kosta.mission;

import java.util.Scanner;

public class Mission04 {
	
	public static void main( String args[]) {
		
		String m_id = "kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("패스워드 : ");
		String pass = sc.nextLine();
		
		if(id.trim().equals(m_id)) {
			if(pass.trim().equals(m_pass))
				System.out.println("로그인 성공");
			else
				System.out.println("패스워드가 일치하지 않습니다.");
		}
		else
			System.out.println("ID가 일치하지 않습니다.");
		
	}
	
}

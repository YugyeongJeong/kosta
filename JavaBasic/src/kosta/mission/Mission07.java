package kosta.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String args[]) {

//		int n;
//		int[] visited = new int[10];
//
//		for (int i = 0; i < 3; i++) {
//			
//			n = (int) (Math.random() * 9 + 1);
//			if(visited[n] == 1 ) {
//				i--;
//				continue;
//			}
//			visited[n] = 1;
//			System.out.println(n);
//
//		}
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		
		for( int i = 0; i < n; i += 2 ) {
			
			for( int j = i; j < n - 1; j ++ ) 
				System.out.print(" ");
			for( int j = n - i -1; j < n; j ++ ) 
				System.out.print("*");
			
			System.out.println();
			
		}

	}

}

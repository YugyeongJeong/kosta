package kosta.basic;

public class ArrayExam {

	public static void main( String args[] ) {
		
		//1. 배열, 선언, 생성 분리
		int arr[]; // 주소 값을 넣을 수 있는 변수가 생성
		arr = new int[5];
		
		//2. 배열선언과 생성 함께
		int arr2[] = new int[5];
		
		//3. 배열선언과 생성과 초기화
		int arr3[] = {1,2,3,4,5};
		
//		for( int i = 0; i < arr3.length; i++ )
//			System.out.println("arr3[" + i + "] = " + arr3[i]);
		
		// 향상된 for문
//		for(int n : arr3) 
//			System.out.print(n + " ");
		
		int arr1[] = new int[10];
		
		for(int i = 1; i < 10; i ++)
			arr1[i] = i * 7;
		
		for(int i = 1; i < 10; i ++)
			System.out.printf("%d * %d = %d\n", 7, i, arr1[i]);
		
	}
}

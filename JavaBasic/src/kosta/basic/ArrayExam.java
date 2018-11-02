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
		
//		for(int i = 1; i < 10; i ++)
//			System.out.printf("%d * %d = %d\n", 7, i, arr1[i]);
		
		//swap( arr3, 0, 1);
		
		for(int i = 0; i < arr.length / 2; i ++) 
			swap( arr3, i, arr.length - i - 1 );
		
		int arr5[] = {1,2,3,4,5};
		int arr6[] = {1,2,3,4,5};
		
		System.out.println("배열 arr5, arr6 " + 
				(equals(arr5, arr6)? "같습니다.": "같지않습니다."));
	}
	
	// 두개의 배열 a, b의 모든 요소가 같은가??
	static boolean equals(int a[], int b[]) {
		
		if(a.length == b.length) {
			for(int i = 0; i < a.length; i ++)
				if( a[i] != b[i]) return false;
		}
		else
			return false;

		return true;

	}
	
	static void swap( int[] arr, int idx1, int idx2 ) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}
	
}

package kosta.basic;

public class SortExam {

	public static void main(String[] args) {

		int arr[] = { 23, 59, 12, 98, 25, 87, 7 };
		
		for(int i = 0; i < arr.length - 1; i ++) 
			for(int j = i + 1; j < arr.length; j ++) 
				if( arr[i] > arr[j]) swap(arr, i, j);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	static void swap(int[] arr, int idx1, int idx2) {

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

	}

}
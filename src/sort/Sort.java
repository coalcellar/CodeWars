package sort;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
//		quickSort(x, low, high);
//		System.out.println(Arrays.toString(x));
		
		int input = 5;
		for(int i = 0; i <= input ; i++ ) {
			System.out.println(fibonacci(i));
		}
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		System.out.println("=== 1   [ i :"+i+" ], [ j : "+j+" ] ==");
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			System.out.println("=== 2   [ i :"+i+" ], [ j : "+j+" ] ==");
		}
 
		// recursively sort two sub parts
		if (low < j) {
			quickSort(arr, low, j);
			System.out.println("=== quick sort   [ low :"+low+" ], [ j : "+j+" ] ==");
		}
			
		if (high > i) {
			quickSort(arr, i, high);
			System.out.println("=== quick sort   [ i :"+i+" ], [ high : "+high+" ] ==");
		}
	}
	
	public static long fibonacci(int n) {
//		long omg = fibonacci(n-1) + fibonacci(n-2);
//		System.out.println("=== omg ::"+omg);
		System.out.println("--- n : "+n);
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
	
}

/* 6.8.16. Cформировать матрицу по заданному образцу. */

package by.itacademy.TwoDimensionalArrays;

public class ex01 {

	public static void main(String[] args) {

		int SizeOfArray = 10;
		int[][] Array = new int[SizeOfArray][SizeOfArray]; 
				
		CreateArray(Array);
		PrintArray(Array);
	

	}
	
	private static void CreateArray(int[][] Arr) {
		
		
		for (int i = 0; i < Arr.length; i++) {

			for (int j = Arr[i].length - 1; j >= 0; j--) {
				
				int Value = Arr.length + 1 - i - (Arr[i].length - j);
				
				if (Value >= 0) 
					Arr[i][j] = Value;
				else
					Arr[i][j] = 0;
			}
		}
				
	}

	private static void PrintArray(int[][] Arr) {

		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {

				System.out.printf("%4d", Arr[i][j]);

			}
			System.out.println();
		}
	}
}

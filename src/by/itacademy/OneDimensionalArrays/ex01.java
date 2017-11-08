/* 6.7.15. Дана последовательность чисел, среди которых имеется 
 * один нуль. Вывести на печать все числа до нуля включительно. */

package by.itacademy.OneDimensionalArrays;

public class ex01 {

	public static void main(String[] args) {
		
		int[] Array = {23, 45, 1, 0, 2, 6, 38};
				
		PrintValuesBeforeNull(Array);
		
	}
	
	private static void PrintValuesBeforeNull(int[] Arr) {

		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] != 0) {
				
				System.out.print(Arr[i] + " ");
				
			} else {
				System.out.print(Arr[i] + " ");
				break;
			}
		}
		
	}

}

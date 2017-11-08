/*6.6.8. Составить программу, которая в массиве A[N] 
 * находит второе по величине число (вывести на печать число, 
 * которое меньше максимального элемента массива, 
 * но больше всех других элементов).*/

package by.itacademy.Subprograms;

public class ex01 {

	public static void main(String[] args) {
	
		int[] Array = {23, 45, 2, 0, 38};
		int rez;
		
		rez = FindSecondValue(Array);
		
		System.out.println("Второе по величине число массива: " + rez);
		
	
	}
	

	private static int FindSecondValue(int[] Arr) {

		for (int i = Arr.length - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {

				if (Arr[j] > Arr[j + 1]) {
					
					int tmp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = tmp;
					
				}
			}
		}

		return Arr[Arr.length - 2];
					
	}

}

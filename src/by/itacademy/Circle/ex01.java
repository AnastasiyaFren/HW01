/* 6.4.3. Одноклеточная амеба каждые 3 часа делится на 2 клетки. 
 * Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа. */

package by.itacademy.Circle;

public class ex01 {

	public static void main(String[] args) {
		
		int number = 1;
		
		for (int i=3; i<= 24; i+=3) {
			
			number *= 2;
			
			switch (i) {
			case 3:
			case 24:
				System.out.println("Количество амеб через " + i + " часа: " + number);
				break;
			case 6:
			case 9:
			case 12:
			case 15:
			case 18:	
				System.out.println("Количество амеб через " + i + " часов: " + number);
				break;
			case 21:
				System.out.println("Количество амеб через " + i + " час: " + number);
				break;
			}
					
		}
		
	}
}

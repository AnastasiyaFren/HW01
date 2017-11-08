/*Задача 6.3.12. Для целого числа А: от 1 до 99 напечатать фразу «Мне k лет», 
учитывая при этом, что при некоторых значениях k слово «лет» 
надо заменить на слово «год» или «года». Например, 11 лет, 22 года, 51 год.*/

package by.itacademy.Switch;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int x;	// вводимое число
		char ch; // последняя цифра числа x
		
		String a = new String(); // число x в виде строки
		
		Scanner sc = new Scanner(System.in);

		// введем значение x
		System.out.println("Введите целое число от 1 до 99: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите целое число от 1 до 99: ");
		}
		x = sc.nextInt();
		
		
		if ((x == 11) || (x == 12) || (x == 13) || (x == 14)) {
			System.out.println("Мне " + x + " лет.");
			
		} else {
			a = Integer.toString(x);
			ch = a.charAt(a.length() - 1);
	
			switch (ch) {
			case '0':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.println("Мне " + x + " лет.");
				break;
			case '1':
				System.out.println("Мне " + x + " год.");
				break;
			case '2':
			case '3':
			case '4':
				System.out.println("Мне " + x + " года.");
				break;
			}
		}
		
		

	}

}

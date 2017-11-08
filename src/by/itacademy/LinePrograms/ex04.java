/*Задача 6.1.2.4. Найти произведение цифр заданного четырехзначного числа. */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
		
		int x;
		int rez = 1;
		String str;
		
		x = 0;
		str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите четырехзначное целое число: ");
		
		while (sc.hasNext()) {

			if (sc.hasNextInt()) {

				x = sc.nextInt();
				str = Integer.toString(x); // переведем в строку

				if (str.length() != 4) { // проверим длину
					System.out.println("Введите четырехзначное целое число: ");

				} else {
					break;

				}
			} else {
				sc.next();
				System.out.println("Введите четырехзначное целое число: ");

			}
		}
		
		while (x != 0) {
			rez = rez * (x % 10);
			x /= 10;
		}

		System.out.println("Произведение цифр: " + rez);

	}

}

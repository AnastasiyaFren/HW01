/*Задача 6.1.3.9. Числа а и b выражают длины катетов одного 
 * прямоугольного треугольника, а с и d — другого. 
 * Эти треугольники являются подобными. */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		// треугольник 1
		double a = 0;
		double b = 0;

		// треугольник 2
		double c = 0;
		double d = 0;

		// отношения катетов
		double rez1;
		double rez2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите длины катетов первого треугольника: ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("Длины катетов первого треугольника: " + a + " и " + b);
				break;
			} else {
				sc.next();
				System.out.println("Введите длины катетов первого треугольника: ");
			}

		}

		System.out.println("Введите длины катетов второго треугольника: ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				d = sc.nextDouble();
				System.out.println("Длины катетов второго треугольника: " + c + " и " + d);
				break;
			} else {
				sc.next();
				System.out.println("Введите длины катетов второго треугольника: ");
			}

		}

		rez1 = a / c;
		rez2 = b / d;

		if (rez1 == rez2) {
			System.out.println("Треугольники подобны - true");
		} else {
			System.out.println("Треугольники подобны - false");
		}

	}
}

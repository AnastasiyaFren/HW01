/*Задача 6.1.1.7. Вычислить значение выражения по формуле. */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double rez, rez1, rez2;
		double M = 0.4342945;
		
		Scanner sc = new Scanner(System.in);
		
		// 1. Введем значение x
		System.out.println("Введите значение x: ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите значение x: ");
		}
		x = sc.nextDouble();
		
		// 2. Введем значение y
		System.out.println("Введите значение y: ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите значение y: ");
		}
		y = sc.nextDouble();
		
		// 3. Вычислим результат
		rez1 = y - Math.sqrt(Math.abs(x));
		rez2 = x - y / (x + Math.pow(x, 2) / 4);
		
		rez = Math.log10(Math.abs(rez1 * rez2)) / M;
		
		// 4. Выведем результат
		System.out.println("Результат: " + rez);
		
				
	}

}

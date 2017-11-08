/*Задача 6.1.1.3. Вычислить значение выражения по формуле. */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	
		double x;
		double y;
		double rez;
		
		Scanner sc = new Scanner(System.in);
		
		// 1. введем значение x
		System.out.println("Ведите значение x: ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Ведите значение x: ");
		}
		x = sc.nextDouble();
		
		// 2. введем значение y
		System.out.println("Ведите значение y: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Ведите значение y: ");
		}
		y = sc.nextDouble();
		
		// 3. вычислим результат rez
		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x)) * Math.tan(x) * y;
		
		
		// 4. выведем результат rez
		System.out.println("Результат rez: " + rez);
		
		

	}

}

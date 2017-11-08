/*Задача 6.2.1. B26. Вычислить число и месяц в невисокосном году по номеру дня.*/

package by.itacademy.Fork;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		int x;   // номер дня в году
		int x1;  // число месяца искомой даты
				
		x1 = 0;
		
		Scanner sc = new Scanner(System.in);

		// введем значение x
		System.out.println("Ведите номер дня в году: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ведите номер дня в году: ");
		}
		x = sc.nextInt();
		
		// определим дату
		if (x <= 31) {
			System.out.println("Дата: " + x + ".01");
			
		} else if (x <= (31 + 28)) {
			x1 = x - 31;
			System.out.println("Дата: " + x1 + ".02");
			
		} else if (x <= (31 + 28 + 31)) {
			x1 = x - 31 - 28;
			System.out.println("Дата: " + x1 + ".03");
			
		} else if (x <= (31 + 28 + 31 + 30)) {
			x1 = x - 31 - 28 - 31;
			System.out.println("Дата: " + x1 + ".04");
		
		} else if (x <= (31 + 28 + 31 + 30 + 31)) {
			x1 = x - 31 - 28 - 31 - 30;
			System.out.println("Дата: " + x1 + ".05");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30)) {
			x1 = x - 31 - 28 - 31 - 30 - 31;
			System.out.println("Дата: " + x1 + ".06");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30;
			System.out.println("Дата: " + x1 + ".07");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30 - 31;
			System.out.println("Дата: " + x1 + ".08");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31;
			System.out.println("Дата: " + x1 + ".09");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30;
			System.out.println("Дата: " + x1 + ".10");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31;
			System.out.println("Дата: " + x1 + ".11");
			
		} else if (x <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31)) {
			x1 = x - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30;
			System.out.println("Дата: " + x1 + ".12");
		}	

	}

}

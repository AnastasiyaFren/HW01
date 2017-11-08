/*Задача 6.1.4.10. Для данных областей составить линейную программу,
 * которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
			
		// координаты точки
		double x = 0;
		double y = 0;
		
		// вспомогательные переменные для расчетов
		double y1 = 0;
		
		// условия
		boolean b1 = false;
		boolean b2 = false;		
		boolean b3 = false;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки: ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
				y = sc.nextDouble();
				System.out.println("Координаты точки: " + "(" + x + ";" + y + ")");
				break;
			} else {
				sc.next();
				System.out.println("Введите координаты точки: ");
			}

		}

		// условие 1
		if ((x >= 0) && (y >= 0)) {
			b1 = true;
		}

		// условие 2
		y1 = -x + 3;
		
		if (y >= y1) {
			b2 = true;
		}

		// условие 3
		if (Math.pow(x, 2) + Math.pow(y, 2) <= 36) {
			b3 = true;
		}
		
		// результат
		if (b1 && b2 && b3) {
			System.out.println("Точка принадлежит закрашенной области - true");
		} else {
			System.out.println("Точка принадлежит закрашенной области - false");
		}


		}

}

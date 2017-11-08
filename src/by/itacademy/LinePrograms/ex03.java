/*Задача 6.1.2.2. Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3). 
 * Найти его периметр и площадь. */

package by.itacademy.LinePrograms;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String [] args) {
		
		double xa, ya;
		double xb, yb;
		double xc, yc;
		double AB, AC, BC;
		double P, S;
		
		Scanner sc = new Scanner(System.in);
		
		///// 1. Введем координаты первой вершины треугольника
		System.out.println("Введите координаты первой вершины треугольника: ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите координаты первой вершины треугольника: ");
		}
		
		xa = sc.nextDouble();
		ya = sc.nextDouble();
		
		System.out.println("Координаты первой вершины треугольника: (" + xa  + ":" + ya + ")");
		
		///// 2. Введем координаты первой вершины треугольника
		System.out.println("Введите координаты второй вершины треугольника: ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите координаты второй вершины треугольника: ");
		}
		
		xb = sc.nextDouble();
		yb = sc.nextDouble();
		
		System.out.println("Координаты второй вершины треугольника: (" + xb  + ":" + yb + ")");
		
		///// 3. Введем координаты первой вершины треугольника
		System.out.println("Введите координаты третьей вершины треугольника: ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите координаты третьей вершины треугольника: ");
		}
		
		xc = sc.nextDouble();
		yc = sc.nextDouble();
		
		System.out.println("Координаты первой третьей треугольника: (" + xc  + ":" + yc + ")");
		
		
		///// 5. Вычислим периметр
		AB = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
		AC = Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yc - ya, 2));
		BC = Math.sqrt(Math.pow(xc - xb, 2) + Math.pow(yc - yb, 2));
		
		P = AB + AC + BC;
		
		System.out.println("Периметр треугольника: " + P);
		
		///// 6. Вычислим площадь
		
		S = 0.5 * ((xa - xc) * (yb - yc) - (xb - xc) * (ya - yc));
		
		System.out.println("Площадь треугольника: " + S);
	}

}

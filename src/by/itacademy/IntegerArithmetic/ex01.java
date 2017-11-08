/* 6.5.7. Среди всех n-значных чисел указать те, 
 * сумма цифр которых равна данному числу k. */

package by.itacademy.IntegerArithmetic;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int NumberOfDigits;  // количество разрядов
		int Value;			// заданное значение
		
		Scanner sc = new Scanner(System.in);

		// введем значение NumberOfDigit
		System.out.println("Введите количество разрядов чисел: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите количество разрядов чисел: ");
		}
		NumberOfDigits = sc.nextInt();
		
		
		// введем значение Value
		System.out.println("Введите любое целое число: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите любое целое число: ");
		}
		Value = sc.nextInt();
		
		
		String StringOfNulls = "";
		
		for (int i=1; i < NumberOfDigits; i++) {
			StringOfNulls = StringOfNulls + '0';
		}
				
		int StartIterator;
		int FinishIterator;
		StartIterator = Integer.parseInt('1' + StringOfNulls);
		FinishIterator = StartIterator * 10;
		
		int Sum = 0;
		int CurrentNumber;
		
		System.out.println(NumberOfDigits + "-значные числа, сумма цифр которых равна " + Value + ":");
		
		for (int i = StartIterator; i < FinishIterator; i++) {
			CurrentNumber = i;
			Sum = 0;
			while (CurrentNumber != 0) {
				Sum = Sum + (CurrentNumber % 10);
				CurrentNumber /= 10;
			}
			if (Sum == Value) {
				System.out.println(i);
				
			}

		}
		

	}

}

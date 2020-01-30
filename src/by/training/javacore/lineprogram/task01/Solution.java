package by.training.javacore.lineprogram.task01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Решение уравнения: z = ((a - 3) * b / 2) + c");
		System.out.println("Введите переменную a: ");
		a = scanner.nextDouble();
		System.out.println("Введите переменную b: ");
		b = scanner.nextDouble();
		System.out.println("Введите переменную c: ");
		
		c = scanner.nextDouble();

		double answer = ((a - 3) * b / 2) + c;
		System.out.println(answer);
	}
}

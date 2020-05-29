package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, e;
		double sum = 0;
		int n;
		
		System.out.print("Введите число e: ");
		e = scanner.nextDouble();
		
		System.out.print("Ведите число n: ");
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		
		System.out.println("Сумма членов ряда равна: " + sum);
		
	}

}

package by.training.module01.branching_programs;

import java.util.Scanner;

public class SolutionTask05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x;
		double result = 0.0;
		
		System.out.print("Введите значение x: ");
		x = scanner.nextInt();
		
		if (x <= 3) {
			result = x * x - 3 * x + 9;
		} else if (x > 3) {
			result = (double) 1 / (x * x * x + 6);
		}
		
		System.out.println("Результат функции: " + result);
	}
}

package by.training.javacore.line_program.task01;

import java.util.Scanner;

public class SolutionTask01 {

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
		
		scanner.close();

		double answer = ((a - 3) * b / 2) + c;
		System.out.println(answer);
	}
}

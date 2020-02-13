package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, h;
		
		System.out.println("Введите a: ");
		a = scanner.nextDouble();
		System.out.println("Введите b: ");
		b = scanner.nextDouble();
		System.out.println("Введите h: ");
		h = scanner.nextDouble();
		
		while (a <= b) {
			if (a > 2) {
				System.out.println(a);
			} else if (a <= 2) {
				System.out.println(-1.0 * a);
			}
			a += h;
		}

	}

}

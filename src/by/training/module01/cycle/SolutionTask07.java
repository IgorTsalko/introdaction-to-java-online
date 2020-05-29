package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask07 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m, n, d;
		
		System.out.println("Введите промежуток, два целых числа через пробел: ");
		m = scanner.nextInt();
		n = scanner.nextInt();
		
		for (int i = m; i <= n; i++) {
			System.out.print("Все делители числа " + i + ": ");
			for (int j = 2; j < i; j++) {
				if (i %j == 0) {
					System.out.print(j + "; ");
				}
			}
			System.out.println();
		}
		
	}

}

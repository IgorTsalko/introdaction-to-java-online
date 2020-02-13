package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count;
		
		System.out.println("Введите целое числоБ сколько кодов символов вывести: ");
		count = scanner.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.printf("%s - %3d \n", (char) i, i);
		}
	}

}

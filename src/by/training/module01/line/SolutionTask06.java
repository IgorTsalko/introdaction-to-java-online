package by.training.module01.line_programs;

import java.util.Scanner;

public class SolutionTask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean b;
		int x, y;
		
		System.out.println("Введите x: ");
		x = scanner.nextInt();
		System.out.println("Введите у: ");
		y = scanner.nextInt();
		
		b = (x <= 4 && x >= -4 && y <= 0 && y >= -3) || (x <= 2 && x >= -2 && y >= 0 && y <= 4);
		
		System.out.print(b);
	}

}

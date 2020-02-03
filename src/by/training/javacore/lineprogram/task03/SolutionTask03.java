package by.training.javacore.lineprogram.task03;

import java.util.Scanner;

public class SolutionTask03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.println("Введите переменную x: ");
		x = scanner.nextDouble();
		System.out.println("Введите переменную y: ");
		y = scanner.nextDouble();
		
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		z *= Math.tan(x*y);
		
		scanner.close();
		
		System.out.print("Результат уравнения: " + z);
	}
}

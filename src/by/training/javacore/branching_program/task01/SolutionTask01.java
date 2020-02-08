package by.training.javacore.branching_program.task01;

import java.util.Scanner;

public class SolutionTask01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int angle1, angle2;
		
		System.out.println("Введите первый угол: ");
		angle1 = scanner.nextInt();
		System.out.println("Введите второй угол: ");
		angle2 = scanner.nextInt();
		
		scanner.close();
		
		if (angle1 + angle2 < 180) {
			if (180 - angle1 - angle2 == 90 || angle1 == 90 || angle2 == 90) {
				System.out.print("Такой треугольник возможет, он будет прямоугольным");
			} else {
				System.out.print("Такой треугольник возможет, он не может быть прямоугольным");
			}
		} else {
			System.out.print("Треугольника с такими углами быть не может!");
		}

	}

}

package by.training.javacore.lineprogram.task01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("������ �������� �������: z = ((a - 3) * b / 2) + c");
		System.out.println("������� �������� ���������� a: ");
		a = scanner.nextDouble();
		System.out.println("������� �������� ���������� b: ");
		b = scanner.nextDouble();
		System.out.println("������� �������� ���������� c: ");
		c = scanner.nextDouble();

		double answer = ((a - 3) * b / 2) + c;
		System.out.println(answer);
	}
}

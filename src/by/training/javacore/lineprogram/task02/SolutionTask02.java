package by.training.javacore.lineprogram.task02;

import java.util.Scanner;

public class SolutionTask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, z;
		
		System.out.println("������� ���������� a: ");
		a = scanner.nextDouble();
		System.out.println("������� ���������� b: ");
		b = scanner.nextDouble();
		System.out.println("������� ���������� c: ");
		c = scanner.nextDouble();
		
		z = b + Math.sqrt(b*b + 4*a*c);
		z /= 2*a;
		z -= Math.pow(a, 3)*c + Math.pow(b, -2);
		
		System.out.println("��������� ���������: " + z);
				
		scanner.close();
	}

}

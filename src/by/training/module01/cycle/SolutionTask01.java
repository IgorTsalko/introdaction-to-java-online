package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int result = 0;
		
		System.out.print("Введите любое целое число: ");
		x = scanner.nextInt();
		
		for (int i = 0; i < x; i++) {
			result += i;
		}
		
		System.out.println("Сумма всех чисел от 1 до введенного вами числа равна: " + result);
	}
}

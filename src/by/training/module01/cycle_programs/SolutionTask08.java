package by.training.module01.cycle_programs;

import java.util.Scanner;

public class SolutionTask08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a, b;
		
		System.out.println("Введите два целых числа через пробел: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a == b) {
			System.out.println("Числа равны, совпадают все цифры");
		} else {
			char[] firstNumber = String.valueOf(a).toCharArray();
			char[] secondNumber = String.valueOf(b).toCharArray();
			
			System.out.print("Цифры, которые входят в запись как первого так и второго числа: ");
			for (int i = 0; i < firstNumber.length; i++) {
				for (int j = 0; j < secondNumber.length; j++) {
					if (firstNumber[i] == secondNumber[j]) {
						System.out.print(firstNumber[i] + "; ");
					}
				}
			}
		}
		
	}

}

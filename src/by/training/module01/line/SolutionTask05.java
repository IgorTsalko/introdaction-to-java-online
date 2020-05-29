package by.training.module01.line_programs;

import java.util.Scanner;

public class SolutionTask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int timeInSec;
		int h, m, s;
		
		System.out.print("Введите время в секундах: ");
		timeInSec = scanner.nextInt();
		
		s = timeInSec%60;
		m = ((timeInSec - s)/60)%60;
		h = ((timeInSec - m)/60)/60;
		
		System.out.print(h + "ч " + m + "мин " + s + "с");
	}

}

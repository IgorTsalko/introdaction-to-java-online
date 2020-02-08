package by.training.javacore.line_program.task04;

public class SolutionTask04 {
	
	public static void main(String[] args) {
		double number = 325.647;
		double fractionPart = number %1;
		double integerPart = (number - fractionPart) / 1000;
		
		double result = Math.ceil(fractionPart * 1000) + integerPart;
		
		System.out.println("Число до : " + number);
		System.out.println("Результат: " + result);
	}
}

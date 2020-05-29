package by.training.module01.cycle_programs;

public class SolutionTask03 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for (int i = 0; i <= 100; i++) {
			result += i*i;
		}
		
		System.out.println("Сумма квадратов первых ста чисел: " + result);

	}

}

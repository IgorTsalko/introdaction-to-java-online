package by.training.module01.branching_programs;

public class SolutionTask04 {

	public static void main(String[] args) {
		int a, b;
		int x, y, z;

		a = 7;
		b = 22;
		
		x = 10;
		y = 7;
		z = 22;
		
		boolean result = false;
		if (a >= x && b >= y || a >= y && b >= x) {
			result = true;
		} else if (a >= y && b >= z || a >= z && b >= y) {
			result = true;
		} else if (a >= x && b >= z || a >= z && b >= x) {
			result = true;
		}
		
		if (result) {
			System.out.println("Кирпичь проходит");
		} else {
			System.out.println("Кирпичь не проходит");
		}
	}

}

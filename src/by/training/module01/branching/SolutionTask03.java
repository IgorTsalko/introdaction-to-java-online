package by.training.module01.branching_programs;

public class SolutionTask03 {
	
	public static void main(String[] args) {
		int x1, x2, x3, y1, y2, y3;
		
		x1 = -2;
		y1 = -3;
		
		x2 = 2;
		y2 = -1;
		
		x3 = 6;
		y3 = 1;
		
		// Если три точки лежат на одной прямой, то площадь треугольника из этих точек
		// будет равна нулю!
	
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Три точки лежат на одной прямой");
		} else {
			System.out.println("Три точки не лежат на одной прямой");
		}
	}
}

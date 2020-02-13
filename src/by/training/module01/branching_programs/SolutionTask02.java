package by.training.module01.branching_programs;

public class SolutionTask02 {

	public static void main(String[] args) {
		double a, b, c, d, r;

		a = 8;
		b = 12;
		c = 76;
		d = 2;

		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

		// or..
		double k, t;
		r = (k = (a < b ? a : b)) > (t = (c < d ? c : d)) ? k : t;

		System.out.print(r);
	}
}

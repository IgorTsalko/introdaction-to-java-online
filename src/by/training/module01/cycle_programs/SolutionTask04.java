package by.training.module01.cycle_programs;

import java.math.BigInteger;

public class SolutionTask04 {

	public static void main(String[] args) {
		
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf(i).pow(2));
		}
		
		System.out.println("Произведение квадратов первых двухсот чисел: " + result);

	}

}

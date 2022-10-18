package tasks.task1_GCD;

public class test {

	public static void main(String[] args) {
		
	//GCD GCD_Test = new GCD();
	
	System.out.println("GCD(42;54) = "+FindGCD.GCD(42, 54));
	
	System.out.println("\nRemainder of dividing= "+FindGCD.getRest(7, 2));
	
	System.out.println("\nRecursive - M1 for GCD(42;54) = "+FindGCD.Recursive_1GCD(54, 42));
	
	System.out.println("\nRecursive - M2 for GCD(42;54) = "+FindGCD.Recursive_2GCD(42, 54));

	}

}

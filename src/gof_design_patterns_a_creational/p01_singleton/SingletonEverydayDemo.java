package gof_design_patterns_a_creational.p01_singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		// Runtime is a singleton and it is unique
		Runtime instanceOne = Runtime.getRuntime();
		
		System.out.println("Instance One: " + instanceOne);
		
		Runtime instanceTwo = Runtime.getRuntime();
		
		System.out.println("Instance Two: " + instanceTwo);
		
		checkInstances(instanceOne, instanceTwo);
	}
	
	private static void checkInstances(Runtime instanceOne, Runtime instanceTwo) {
		System.out.println();
		if(instanceOne.equals(instanceTwo)) {
			System.out.printf("The instances %s and %s are the same instances.", instanceOne, instanceTwo);
		} else {
			System.out.printf("The instances %s and %s are different unique instances.", instanceOne, instanceTwo);
		}
	}

}

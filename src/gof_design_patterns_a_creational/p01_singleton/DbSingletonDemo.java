package gof_design_patterns_a_creational.p01_singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instanceOne = DbSingleton.getInstance();
		DbSingleton instanceTwo = DbSingleton.getInstance();
		
		System.out.println("Checking DbSingleton instances;");
		checkInstances(instanceOne, instanceTwo);
	}
	
	private static void checkInstances(DbSingleton instanceOne, DbSingleton instanceTwo) {
		System.out.println();
		if(instanceOne.equals(instanceTwo)) {
			System.out.printf("The instances %s and %s are the same instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		} else {
			System.out.printf("The instances %s and %s are different unique instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		}
	}

}

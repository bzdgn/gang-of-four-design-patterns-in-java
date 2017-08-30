package gof_design_patterns_a_creational.p01_singleton;

public class DbSingletonLazyLoadingDemo {

	public static void main(String[] args) {
		DbSingletonLazyLoading instanceOne = DbSingletonLazyLoading.getInstance();
		DbSingletonLazyLoading instanceTwo = DbSingletonLazyLoading.getInstance();
		
		System.out.println("Checking DbSingletonLazyLoading instances;");
		checkInstances(instanceOne, instanceTwo);
	}
	
	private static void checkInstances(DbSingletonLazyLoading instanceOne, DbSingletonLazyLoading instanceTwo) {
		System.out.println();
		if(instanceOne.equals(instanceTwo)) {
			System.out.printf("The instances %s and %s are the same instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		} else {
			System.out.printf("The instances %s and %s are different unique instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		}
	}

}

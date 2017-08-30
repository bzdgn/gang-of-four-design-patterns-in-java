package gof_design_patterns_a_creational.p01_singleton;

public class DbSingletonLazyLoadingThreadSafeDemo {

	public static void main(String[] args) {
		DbSingletonLazyLoadingThreadSafe instanceOne = DbSingletonLazyLoadingThreadSafe.getInstance();
		DbSingletonLazyLoadingThreadSafe instanceTwo = DbSingletonLazyLoadingThreadSafe.getInstance();
		
		System.out.println("Checking DbSingletonLazyLoading instances;");
		checkInstances(instanceOne, instanceTwo);
	}
	
	private static void checkInstances(DbSingletonLazyLoadingThreadSafe instanceOne, DbSingletonLazyLoadingThreadSafe instanceTwo) {
		System.out.println();
		if(instanceOne.equals(instanceTwo)) {
			System.out.printf("The instances %s and %s are the same instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		} else {
			System.out.printf("The instances %s and %s are different unique instances.", instanceOne.hashCode(), instanceTwo.hashCode());
		}
	}

}

package gof_design_patterns_a_creational.p01_singleton;

/*
 * The primitive Singleton example class
 * Notify that instance is stored in a static reference and it is thread safe.
 * 
 * Also the instance is Lazy Loaded so the instance is instantiated
 * when there is a call to getInstance method.
 * 
 * Check out the double-null-check mechanism used in the getInstance method for
 * better performance.
 */
public class DbSingletonLazyLoadingThreadSafe {
	/*
	 * Instance is the reference to the unique static Singleton class instance.
	 * The instance is lazily loaded which means, it is not created as the JVM starts
	 * but it is created whenever it is needed via the call to getInstance method.
	 */
	private static DbSingletonLazyLoadingThreadSafe instance = null;
	
	/*
	 * The private constructor of the Singleton
	 * We want nobody can call the constructor outside, clients are only allowed
	 * to get the unique instance via the public getInstance method
	 */
	private DbSingletonLazyLoadingThreadSafe() {
	}
	
	/* 
	 * With only the static getInstance method, the client can reach to the unique instance
	 * but cannot modify the private instance reference inside the class.
	 * 
	 * This version of getInstance is Lazily Loading the instance which means, at the startup
	 * of JVM, the instance is null and whenever the call to getInstance is done, the instantiating
	 * is triggered.
	 */
	public static DbSingletonLazyLoadingThreadSafe getInstance() {
		if(instance == null) {	// null-check with no thread-safety, if not null, use it
			synchronized(DbSingletonLazyLoadingThreadSafe.class) {	// synchronized block, performance costly
				if(instance == null) {
					instance = new DbSingletonLazyLoadingThreadSafe();
				}
			}
			
		}
		
		return instance;
	}
}

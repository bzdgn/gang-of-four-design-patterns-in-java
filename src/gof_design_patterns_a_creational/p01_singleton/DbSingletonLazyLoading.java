package gof_design_patterns_a_creational.p01_singleton;

/*
 * The primitive Singleton example class
 * Notify that instance is stored in a static reference and it is not thread safe.
 * 
 * Also the instance is Lazy Loaded so the instance is instantiated
 * when there is a call to getInstance method.
 */
public class DbSingletonLazyLoading {
	/*
	 * Instance is the reference to the unique static Singleton class instance.
	 * The instance is lazily loaded which means, it is not created as the JVM starts
	 * but it is created whenever it is needed via the call to getInstance method.
	 */
	private static DbSingletonLazyLoading instance = null;
	
	/*
	 * The private constructor of the Singleton
	 * We want nobody can call the constructor outside, clients are only allowed
	 * to get the unique instance via the public getInstance method
	 */
	private DbSingletonLazyLoading() {
	}
	
	/* 
	 * With only the static getInstance method, the client can reach to the unique instance
	 * but cannot modify the private instance reference inside the class.
	 * 
	 * This version of getInstance is Lazily Loading the instance which means, at the startup
	 * of JVM, the instance is null and whenever the call to getInstance is done, the instantiating
	 * is triggered.
	 */
	public static DbSingletonLazyLoading getInstance() {
		if(instance == null) {
			instance = new DbSingletonLazyLoading();
		}
		
		return instance;
	}
}

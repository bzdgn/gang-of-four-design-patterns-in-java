package gof_design_patterns_a_creational.p01_singleton;

public class DbSingleton {
	
	// instance is the reference to the unique static Singleton class instance
	private static DbSingleton instance = new DbSingleton();
	
	/*
	 * The private constructor of the Singleton
	 * We want nobody can call the constructor outside, clients are only allowed
	 * to get the unique instance via the public getInstance method
	 */
	private DbSingleton() {
	}
	
	/* 
	 * With only the static getInstance method, the client can reach to the unique instance
	 * but cannot modify the private instance reference inside the class
	 */
	public static DbSingleton getInstance() {
		return instance;
	}

}

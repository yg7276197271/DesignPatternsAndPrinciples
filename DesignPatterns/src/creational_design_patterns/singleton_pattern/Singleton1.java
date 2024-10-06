//https://www.geeksforgeeks.org/singleton-design-pattern/

package creational_design_patterns.singleton_pattern;
//Thread Synchronized Java implementation of
//singleton design pattern
public class Singleton1 {
	private static Singleton1 obj;
	 
    private Singleton1() {}
 
    // Only one thread can execute this at a time
    public static synchronized Singleton1 getInstance()
    {
        if (obj==null)
            obj = new Singleton1();
        return obj;
    }
}

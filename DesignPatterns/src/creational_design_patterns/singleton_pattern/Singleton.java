//https://www.geeksforgeeks.org/singleton-design-pattern/

package creational_design_patterns.singleton_pattern;
//Classical Java implementation of singleton
//design pattern
public class Singleton {
	private static Singleton obj;
	 
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}

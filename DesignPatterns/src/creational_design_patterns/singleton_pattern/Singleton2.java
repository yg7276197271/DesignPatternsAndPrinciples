package creational_design_patterns.singleton_pattern;
//Double Checked Locking based Java implementation of
//singleton design pattern
public class Singleton2 {
	private static volatile Singleton2 obj  = null;
	 
    private Singleton2() {}
 
    public static Singleton2 getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (Singleton2.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new Singleton2();
            }
        }
        return obj;
    }
}

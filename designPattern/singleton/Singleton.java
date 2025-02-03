package machineCoding.designPattern.singleton;


/* 
this is completely thread safe, instance is created at class loading in memory
*/
 
public class Singleton {
    public static final Singleton instance = new Singleton(); 

    private Singleton(){
        System.out.println("hello");
    }

    public static Singleton getInstance() { return instance; }


}

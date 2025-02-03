package machineCoding.designPattern.singleton;

/* 
ensures that a single instance of class is created during runtime
*/ 
public class Main {
    public static void main(String args[])
    {
       Singleton singleton = Singleton.getInstance();
       System.out.println(singleton);
    }
}

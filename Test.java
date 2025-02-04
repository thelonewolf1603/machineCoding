
public class Test {
    public static final Test instance = null;

    public static Test getInstance()
    {
        if(instance == null) return new Test();
        return instance;
    }

     private Test(){}
}

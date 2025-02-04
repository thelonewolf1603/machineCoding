package designPattern.composite;

public class DashGenerator {

    public String generate(int count)
    {
        String result = "";
        while(count > 0) {result += " - "; count--;}

        return result;
    }
    
}

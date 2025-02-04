package designPattern.composite;

public class File implements FileSystem{
    
    private String name;
    private DashGenerator dashGenerator;
    public File(String name) {this.name = name; dashGenerator = new DashGenerator();}

    @Override
    public void getDetails(int level)
    {
        System.out.println(dashGenerator.generate(level) + "file name : " + name);
    }
}

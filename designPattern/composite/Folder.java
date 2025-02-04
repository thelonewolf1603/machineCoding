package designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> children;
    private DashGenerator dashGenerator;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        dashGenerator = new DashGenerator();
    }

    public void add(FileSystem component)
    {
        children.add(component);
    }

    public void remove(FileSystem component)
    {
        children.remove(component);
    }

    @Override
    public void getDetails(int level)
    {
        System.out.println(dashGenerator.generate(level) + "folder name: " + name);
        for(FileSystem child : children)
        {
            child.getDetails(level+1);
        }
    }

}

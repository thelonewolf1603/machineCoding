package designPattern.composite;

public class Main {

    public static void main(String args[])
    {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");

        folder1.add(file1); folder1.add(folder2); folder3.add(file3);
        folder2.add(folder3);

        folder2.add(file2);

        folder1.getDetails(0);
    }
    
}

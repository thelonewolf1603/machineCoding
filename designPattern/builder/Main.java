package designPattern.builder;

public class Main {

    public static void main(String args[])
    {
        House house1 = new House.HouseBuilder().addCarpetArea(1200).addBedrooms(4).addBalconies(2).build();
        System.out.println(house1.getCarpetArea());
    }
    
}

package designPattern.builder;
/* 
 The Builder Pattern is a creational design pattern used to construct complex objects step by step. It allows the creation of different representations of an object using the same construction process.
Instead of having a constructor with too many parameters, the Builder pattern provides a step-by-step approach to object construction, making it more readable and maintainable.
*/

public class House {
    private final int bedrooms;
    private final int kitchens;
    private final int halls;
    private final int balconies;
    private final int bathrooms;
    private final int totalArea;
    private final int carpetArea;

    private House(HouseBuilder builder)
    {
        this.bedrooms = builder.bedrooms;
        this.kitchens = builder.kitchens;
        this.halls = builder.halls;
        this.balconies = builder.balconies;
        this.bathrooms = builder.bathrooms;
        this.totalArea = builder.totalArea;
        this.carpetArea = builder.carpetArea;
    }


    // getters start

    public int getBedrooms() {return this.bedrooms;}
    public int getKitchens() {return this.kitchens;}
    public int getHalls() {return this.halls;}
    public int getBalconies() {return this.balconies;}
    public int getBathrooms() {return this.bathrooms;}
    public int getTotalArea() {return this.totalArea;}
    public int getCarpetArea() {return this.carpetArea;}

    // getters end


    // nested builder class
    public static class HouseBuilder {
        private int bedrooms;
        private int kitchens;
        private int halls;
        private int balconies;
        private int bathrooms;
        private int totalArea;
        private int carpetArea;

        public HouseBuilder addBedrooms(int bedrooms)
        {
            this.bedrooms = bedrooms;
            return this;
        }

        public HouseBuilder addKitchens(int kitchens)
        {
            this.kitchens = kitchens;
            return this;
        }

        public HouseBuilder addBathrooms(int bathrooms)
        {
            this.bathrooms = bathrooms;
            return this;
        }

        public HouseBuilder addHalls(int halls)
        {
            this.halls = halls;
            return this;
        }

        public HouseBuilder addBalconies(int balconies)
        {
            this.balconies = balconies;
            return this;
        }

        public HouseBuilder addTotalArea(int totalArea)
        {
            this.totalArea = totalArea;
            return this;
        }

        public HouseBuilder addCarpetArea(int carpetArea)
        {
            this.carpetArea = carpetArea;
            return this;
        }

        public House build()
        {
            return new House(this);
        }

    }
    
}

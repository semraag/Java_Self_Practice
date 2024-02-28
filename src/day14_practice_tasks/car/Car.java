package day14_practice_tasks.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private  double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        if (make==null || make.isEmpty()){
            throw new RuntimeException("make can not be empty or null");        }
        this.model = model;
        if (model== null || model.isEmpty()){
            throw new RuntimeException("model can not be empty or null");     }
        this.year = year;
        if (year<1886){
            throw new RuntimeException("year must not less than 1886");    }
        setPrice(price);
        setColor(color);
    }

    public String getMake() {return make;}
    public String getModel() {return model;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    public double getPrice() {return price;}



    public void setColor(String color) {
        if (color==null || color.isEmpty() ){
            throw new RuntimeException("Color can not be empty or null ");
        }   this.color = color;   }

    public void setPrice(double price) {
        if (price<0){
            throw  new RuntimeException("Price can not be negative");
        }   this.price = price;    }
    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(getMake()+" is stopping");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

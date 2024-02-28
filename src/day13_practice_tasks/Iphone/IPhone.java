package day13_practice_tasks.Iphone;

public class IPhone {
    private String brand,model,size,color;    private double price;
    public IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.err.println("Invalid input/data for the brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.err.println("Invalid input/data for the model: " + model);
            System.exit(1);
        }
        this.model = model;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid input/data for the color: " + color);
            System.exit(1);
        }
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Unit price can not be negative: " + price);
            System.exit(1);
            this.price = price;
        }
    }
    public void call (int phoneNumber){
        System.out.println("Calling the number " + phoneNumber);
    }
    public void text (int phoneNumber){
        System.out.println("Texting to the number " + phoneNumber);
    }
    public void faceTime (int phoneNumber){
        System.out.println("Facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
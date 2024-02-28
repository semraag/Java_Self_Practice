package day12_practice_tasks;

public class Candy {
    private String brand;  private int quantity;  private double price;  private boolean hasPeanuts;
    public String getBrand() {return brand;}
    public int getQuantity() {return quantity;}
    public double getPrice() {return price;}
    public String getFreePrice(){
        if(getPrice() == 0){
            return "free";
        }else{
            return getPrice() +"";
        }
    }
    public boolean isHasPeanuts() {return hasPeanuts;}
    public void  setInfo(String brand, int quantity, double price, boolean hasPeanuts) {
        if (price < 0) {
            System.err.println("Unit price can not be negative: " + price);
            System.exit(1);
        }
        if (quantity < 0) {
            System.err.println("Quantity can not be negative or zero : " + quantity);
            System.exit(1);
        }
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    @Override public String toString() {
        return "Candy{" +
                "brand='" + brand +'\'' +
                ", quantity=" + quantity +
                ", price=" + getFreePrice() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}

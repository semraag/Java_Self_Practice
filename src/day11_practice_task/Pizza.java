package day11_practice_task;
public class Pizza {
    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping,quantity;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping, int quantity) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.quantity = quantity;
    }
    public double calcost(){
        double totalCost = 0;
        double startingPrice = (size.equalsIgnoreCase("small"))? 10
                :size.equalsIgnoreCase("medium")? 14 : 16;
        int topping = 2*(numberOfCheeseTopping +numberOfPepperoniTopping);

        totalCost = quantity * ( startingPrice + topping);
        return totalCost;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", quantity=" + quantity +
                ", calcost=" + calcost() +
                '}';
    }
}

package day12_practice_tasks;

public class Item {
    private String name;     private double unitPrice ;     private int quantity;
    public String getName() {return name;}
    public double getUnitPrice() {return unitPrice;}
    public int getQuantity() {return quantity;}
    public void setInfo(String name,double unitPrice,int quantity) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }
        if ( !Character.isLetter(name.charAt(0)) ){
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }

        char[] eachLetter = name.toCharArray();
        for (char each : eachLetter) {
            if (!Character.isLetterOrDigit(each) && !Character.isWhitespace(each)) {
                System.err.println("Invalid input/data for the name: " + name);
                System.exit(1);
            }
            if (unitPrice < 0) {
                System.err.println("Unit price can not be negative: " + unitPrice);
                System.exit(1);
            }
            if (quantity < 0) {
                System.err.println("Quantity can not be negative: " + quantity);
                System.exit(1);
            }

            this.name = name;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }
    }
    public  double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost = " + calcCost() +
                '}';
    }
}

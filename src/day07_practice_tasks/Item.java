package day07_practice_tasks;

public class Item {

    public String itemName;
    public double unitPrice ;
    public int quantity;

    public void calcCost(){
        double calcCost = unitPrice * quantity;
        System.out.println("Total cost = $" + calcCost);

    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
} /* Create a custom class named Item with the following attributes and actions:

      Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the quantity of the item.
            quantity (int): used for storing the unit price of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.*/

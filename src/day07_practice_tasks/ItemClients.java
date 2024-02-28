package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

         Item item1 = new Item();
         item1.itemName = "Fruit juice";
         item1.quantity = 500;
         item1.unitPrice = 1.2;

         item1.calcCost();
        System.out.println(item1);

        System.out.println("--------------------------------");

        Item item2= new Item();
        item2.itemName = "Shoe";
        item2.quantity = 20;
        item2.unitPrice = 50.5;
        item2.calcCost();
        System.out.println(item2);
    }
}

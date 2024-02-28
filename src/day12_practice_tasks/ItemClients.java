package day12_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("IPhone",250,500);
        System.out.println(item1);

        Item item2 = new Item();
        item2.setInfo("Fridge",500,150);
        System.out.println(item2);


        Item item3 = new Item();
        item3.setInfo("2Hair dryer",-35,50);
        System.out.println(item3);

    }
}

package day11_practice_task;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,2,2);
        System.out.println(pizza1.calcost());


        Pizza pizza2 = new Pizza("medium",4,2,3);
        System.out.println(pizza2);


        Pizza pizza3 = new Pizza("Large",1,2,3);
        System.out.println(pizza3);

    }
}

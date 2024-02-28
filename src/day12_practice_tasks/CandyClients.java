package day12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {

        Candy candy1 = new Candy();
        candy1.setInfo("Ülker",1000,0.5,false);
        System.out.println(candy1);


        Candy candy2 = new Candy();
        candy2.setInfo("Sölen",1500,0.35,true);
        System.out.println(candy2);


        Candy candy3 = new Candy();
        candy3.setInfo("Elvan",750,0.0,false);
        System.out.println(candy3);
    }
}

package day13_practice_tasks.state;

public class StateClients {
    public static void main(String[] args) {
        California california = new California("California", "CA", "GOP", "Newsom", "Allen", 39);
        System.out.println(california);
        Florida florida = new Florida("Florida", "FL", "GOP", "DeSantis", "Rick Scott", 22);
        System.out.println(florida);
        Texas texas = new Texas("Texas", "TX", "GOP", "Abbott", "Rusk", 30);
        System.out.println(texas);
        Virginia virginia = new Virginia("Virginia", "VA", "GOP", "Youngkin", "Mark Warner", 7);
        System.out.println(virginia);
    }
}

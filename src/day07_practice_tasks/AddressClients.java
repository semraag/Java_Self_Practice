package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {



        Address address1 = new Address();
      /*  address1.buildingNumber = 7925;
        address1.street= "Jones Branch Dr";
        address1.city = "Mclean";
        address1.state = "VA";
        address1.zipCode = "22012";   */

        address1.setInfo(7925,"Jones Branch Dr","Mclean","VA","22012");

        System.out.println(address1.buildingNumber +" "+address1.street +"\n"+address1.city +" "
        + address1.state+", " + address1.zipCode);
    }
}

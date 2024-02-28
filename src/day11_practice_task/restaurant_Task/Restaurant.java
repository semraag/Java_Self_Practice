package day11_practice_task.restaurant_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Restaurant {

    public String owner,
            location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>(Arrays.asList());
    public ArrayList<Chef> chefs = new ArrayList<>(Arrays.asList());;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }
    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefs.remove(employeeID);
    }
    public void terminateServer(int employeeID){
        servers.remove(employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", " + servers.size() +
                " servers=" + servers +
                ", " + chefs.size() +
                " chefs=" + chefs +
                '}';
    }
}

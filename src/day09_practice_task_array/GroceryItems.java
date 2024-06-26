package day09_practice_task_array;

public class GroceryItems {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        //  10.2
        for (int i = 0; i < items.length; i++) {

            String[] eachArray = items[i];


            for (int j = 0; j < eachArray.length ; j++) {
                System.out.print(eachArray[j]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        // 10.3
        for (int i = 0; i <items.length  ; i++) {

            for (int j = items[i].length -1;  j >= 0 ; j--) {

                System.out.print(items[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

    }
}

/*10. Create a class named GroceryItems and write a program with the following specifications:
        10.1 Given the following array:


    10.2 Print the following output: (add \t between two words)
Apple    Banana   Grape    Avocado
Paper Towels     Toilet Papers   Tissues    Diapers
Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
Avocado   Grape    Banana    Apple
Diapers   Tissues   Toilet Papers   Paper Towels
Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
Coke   Fanta   Arizona Tea   Pepsi   Water
Paper Towels     Toilet Papers   Tissues    Diapers
Apple    Banana   Grape    Avocado */
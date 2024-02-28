package day05_practice_tasks;

public class Alphabets {
    public static void main(String[] args) {

        char lowerCase = 'a';
        char upperCase = 'A';
        for (upperCase = 'A'; upperCase <= 'Z'; upperCase++) {
            for (lowerCase= 'a'; lowerCase <= 'z';lowerCase++){
                System.out.print(upperCase);
                System.out.print(lowerCase+" ");
            }
            if(upperCase >= 'E') {
                break;
            }
            System.out.println();
        }
    }
}

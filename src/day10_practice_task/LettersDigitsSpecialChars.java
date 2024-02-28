package day10_practice_task;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letter = "";
        String digits = "";
        String specialChars = "";
        for (char eachChar : str.toCharArray()) {

            if (Character.isLetter(eachChar)) {
                letter += eachChar;
            }
            if (Character.isDigit(eachChar)) {
                digits += eachChar;
            }
            if (!(Character.isLetterOrDigit(eachChar))) {
                specialChars += eachChar;
            }
        }
        System.out.println("Letter= \"" + letter+" \"");
        System.out.println("Digits= \"" + digits+" \"");
        System.out.println("specialChars= \"" + specialChars+" \"");
    }
}
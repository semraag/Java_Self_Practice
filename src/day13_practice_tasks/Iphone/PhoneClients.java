package day13_practice_tasks.Iphone;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple","Pro","6.12","Gray",1500);
        iPhone.call(1234567890);
        iPhone.faceTime(1234567890);
        iPhone.text(1234567890);
        System.out.println(iPhone);
        System.out.println("----------------------------------------------------------------");


        Samsung samsung = new Samsung("Samsung","S24","6.2","Write",1000);
        samsung.call(1234567890);
        samsung.faceTime(1234567890);
        samsung.text(1234567890);
        System.out.println(samsung);
        System.out.println("----------------------------------------------------------------");



        Nokia nokia = new Nokia("Nokia","6020","2,4","Blau",150);
        nokia.call(1234567890);
        nokia.faceTime(1234567890);
        nokia.text(1234567890);
        System.out.println(nokia);


    }
}

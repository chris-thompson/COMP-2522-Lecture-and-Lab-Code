package labs;

import java.util.ArrayList;

public class Lab01 {

    public static void main(String[] args) {

//        int i = 10;
//        while (i > 0) {
//            System.out.println(i--);
//        }
//        double pi = 3.14159258;
//        do {
//            System.out.println("This is a positive number");
//            pi -= 1;
//        } while (pi > 0);

        for (int i = 0; i < 100; ++i) {
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<String>();
        names.add("Marti");
        names.add("April");
        names.add("Sally");
        names.add("Joel");
        for (String studentName : names) {
            System.out.println(studentName);
        }

        String name = "Susan";
        String anotherName = name.toLowerCase();
        System.out.println(name);
        System.out.println(anotherName);
        System.out.println(name.toUpperCase());

    }


}

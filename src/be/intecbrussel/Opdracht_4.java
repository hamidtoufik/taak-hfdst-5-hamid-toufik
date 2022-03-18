package be.intecbrussel;
import java.util.*;


public class Opdracht_4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type number one in");
        int waarde1 = reader.nextInt();

        System.out.println("type number two in");
        int waarde2 = reader.nextInt();

        System.out.println(waarde1 + waarde2);
        System.out.println(waarde1 - waarde2);
        System.out.println(waarde1 * waarde2);
        System.out.println(waarde1 / waarde2);
        System.out.println(waarde1 % waarde2);
        System.out.println(--waarde1);
        System.out.println(waarde1--);
        System.out.println(++waarde1);
        System.out.println(waarde1++);












        reader.close();


    }

}

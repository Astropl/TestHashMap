package SDA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map <Integer, String> listMapy = new HashMap <Integer, String>();
Integer pobierz;
        listMapy.put(1,"Pierwszy");
        listMapy.put(2,"Drugi");
        listMapy.put(3,"Trzeci");
        do {
            System.out.println("wybierz cyfre 1,2,3");
            Scanner sc = new Scanner(System.in);
            pobierz = sc.nextInt();
            if (pobierz==0)
            {
                System.out.println("Koniec");
                break;
            }
            System.out.println(listMapy.get(pobierz));
            //System.out.println(listMapy.values());
            //System.out.println(listMapy.g);
        }while (pobierz !=0);
    }
}

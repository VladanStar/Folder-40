package undpmetode01;

import java.util.Scanner;

public class UNDPMETODE01 {

    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Unesite donju granicu niza a=: ");
            int a = input.nextInt();
            System.out.println("Unesite gornju granicu niza b= : ");
            int b = input.nextInt();
            System.out.println("Zbir " + a + ", " + b + " je " + zbir(a, b));

            System.out.println("Da l zelite da nastavite program: unesite (da ili ne:) ");
            String sc = input.next();
            if (sc.equals("da")) 
                continue;
             else 
                break;
            

        }
        System.out.println("Kraj programa");

    }

    static int zbir(int a, int b) {
        int zbir = 0;
        for (int i = a; a < b; a++) {
            zbir += i;
        }
        return zbir;
    }

}

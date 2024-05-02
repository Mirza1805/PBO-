package Tugas1;

import java.util.Scanner;

public class tugas2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // segitiga siku
        System.out.print("Silakan masukkan alas segitiga: ");
        double alassegitiga = scanner.nextDouble();
        System.out.print("Silakan masukkan tinggi segitiga: ");
        double tinggisegitiga = scanner.nextDouble();
        System.out.println(
                "Luas segitiga siku siku dengan alas = " + alassegitiga + " dan tinggi = " + tinggisegitiga
                        + " adalah = "
                        + hitungsegitiga(alassegitiga, tinggisegitiga));

        scanner.close();
    }

    public static double hitungsegitiga(double alass, double tinggis) {
        return alass * tinggis * 0.5;
    }

}

package Tugas1;

import java.util.Scanner;

public class tugas2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tabung
        System.out.print("Silakan masukkan diameter tabung : ");
        double diametertabung = scanner.nextDouble();
        System.out.print("Silakan masukkan tinggi tabung: ");
        double tinggitabung = scanner.nextDouble();
        System.out.println("Volume dari tabung dengan diameter = " + diametertabung + " dan tinggi = " + tinggitabung
                + " adalah = " + hitungtabung(diametertabung, tinggitabung));

        scanner.close();
    }

    public static double hitungtabung(double diameterl, double tinggil) {
        double radius = diameterl / 2;
        return Math.PI * Math.pow(radius, 2) * tinggil;
    }

}

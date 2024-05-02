package Tugas1;

import java.util.Scanner;

public class tugas2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lingkaran
        System.out.print("Silakan masukkan diameter lingkaran: ");
        double diameterlingkaran = scanner.nextDouble();
        System.out.println("Keliling lingkaran dengan diameter = " + diameterlingkaran + " adalah = "
                + hitunglingkaran(diameterlingkaran));

        scanner.close();
    }

    public static double hitunglingkaran(double diameter) {
        return Math.PI * diameter;
    }

}

<<<<<<< HEAD
package ResponsiUTS;

import java.util.*;

public class InheritMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name, address, nim, hobi;

        int sks, spp, modul;

        System.out.print("Masukkan Nama: ");
        name = inp.next();
        System.out.print("Masukkan NIM: ");
        nim = inp.next();
        System.out.print("Masukkan Alamat: ");
        address = inp.next();
        System.out.print("Masukkan Hobi: ");
        hobi = inp.next();
        System.out.print("Masukkan Modul: ");
        modul = inp.nextInt();
        System.out.print("Masukkan SKS: ");
        sks = inp.nextInt();
        System.out.print("Masukkan SPP: ");
        spp = inp.nextInt();

        Student mhs1 = new Student(name, nim, address, modul, sks, spp, hobi);
        System.out.println("\nData Mahasiswa\n");
        mhs1.identity();
    }
}
=======
package ResponsiUTS;

import java.util.*;

public class InheritMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name, address, nim, hobi;

        int sks, spp, modul;

        System.out.print("Masukkan Nama: ");
        name = inp.next();
        System.out.print("Masukkan NIM: ");
        nim = inp.next();
        System.out.print("Masukkan Alamat: ");
        address = inp.next();
        System.out.print("Masukkan Hobi: ");
        hobi = inp.next();
        System.out.print("Masukkan Modul: ");
        modul = inp.nextInt();
        System.out.print("Masukkan SKS: ");
        sks = inp.nextInt();
        System.out.print("Masukkan SPP: ");
        spp = inp.nextInt();

        Student mhs1 = new Student(name, nim, address, modul, sks, spp, hobi);
        System.out.println("\nData Mahasiswa\n");
        mhs1.identity();
    }
}
>>>>>>> 0b1cfcdfc791bc1e95e55a3cd9fd4be41083c26f

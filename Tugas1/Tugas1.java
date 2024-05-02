package Tugas1;

public class Tugas1 {
    String nama;

    public void perkenalan() {
        System.out.println("Halo, nama saya adalah " + nama);
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program java");
    }
    public static void main(String[] args)
    {
        Tugas1 nm1= new Tugas1();
        nm1.nama="Muhammad Mirza Rafi'uddin";
        nm1.perkenalan();
    }
}

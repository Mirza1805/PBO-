package week1;

public class Mahasiswa {
    String nim, nama;
    int usia;

    public void belajar() {
        System.out.println(nama + " belajar");
    }

    public void mainGame() {
        System.out.println(nama + " main game");
    }

    public void getIdentitas() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        System.out.println("Usia: " + usia);
    }

}// cara compile buka terminal (javac week1\Mahasiswa.java)
 // cara ngerun (java week1.Mahasiswa)
package week1;

public class Aksimahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "A11.2022.14344";
        mhs1.nama = "Mirza";
        mhs1.usia = 20;
        mhs1.getIdentitas();
        mhs1.belajar();
        mhs1.mainGame();
        System.out.println(" ");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "A11.2022.14345";
        mhs2.nama = "Winny";
        mhs2.usia = 19;
        mhs2.getIdentitas();
        mhs2.belajar();
        mhs2.mainGame();
    }
}
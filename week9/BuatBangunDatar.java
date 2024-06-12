package week9;

public class BuatBangunDatar {
    public static void main(String[] args) {
        System.out.println("---- Persegi ----");
        BangunDatar persegi = new BangunDatar(12);
        persegi.getInfo();
        System.out.println("---- Persegi Panjang ----");
        BangunDatar persegipanjang = new BangunDatar(12, 30);
        persegipanjang.getInfo();
        System.out.println("---- Lingkaran ----");
        BangunDatar lingkarang = new BangunDatar();
        lingkarang.setDiameter(10);
        lingkarang.getInfo();
        System.out.println("---- Balok ----");
        BangunRuang balok = new BangunRuang(10, 5, 400);
        balok.getInfo();

    }
}
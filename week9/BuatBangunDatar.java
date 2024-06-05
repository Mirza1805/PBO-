package week9;

public class BuatBangunDatar {
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(12);
        persegi.getInfo();
        system.out.println(" ");
        BangunDatar persegipanjang = new BangunDatar(12, 30);
        persegipanjang.getInfo();
        system.out.println(" ");
        BangunDatar lingkarang = new BangunDatar();
        lingkarang.setDiameter(10);
        lingkarang.getInfo();
        system.out.println(" ");
        BangunRuang balok = new BangunRuang(10, 5, 400);
        balok.getInfo();
        system.out.println(" ");

    }
}
package week10;

public class main{
    public static void main(String[] args) {
    System.out.println("----Persegi Panjang----");
    PersegiPanjang PersegiP = new PersegiPanjang(10,5);
    PersegiP.luas();
    PersegiP.keliling();
    System.out.println("----Lingkarang----");
    Lingkaran Lk = new Lingkaran(5);
    Lk.luas();
    Lk.keliling();
    }
}
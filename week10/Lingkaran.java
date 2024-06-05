package week10;

public class Lingkaran extends BangunDatar {
    private double radius;
    private static final double pi = 3.14;

    public Lingkaran(double radius){
        this.radius=radius;

    }

    public double getRadius(){
        return radius;
    }

    public double hitungluas(){
        return pi*radius*radius;
    }
    public double hitungkeliling(){
        return 2*pi*radius;
    }
    public void luas(){
        System.out.println("Luas Lingkaran dengan diameter = " + radius + " adalah = "+hitungluas());
    }
    public void keliling(){
        System.out.println("Keliling Lingkaran dengan diameter = " + radius + " adalah = "+ hitungkeliling());
    }

}
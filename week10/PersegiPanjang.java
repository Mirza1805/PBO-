package week10;

public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;

    }

    public int getpanjang(){
        return panjang;
    }
    public int getlebar(){
        return lebar;
    }
    public int hitungluas(){
        return panjang*lebar;
    }
    public int hitungkeliling(){
        return 2*(panjang+lebar);
    }
    public void luas(){
        System.out.println("Luas Persegi Panjang dengan panjang = " + panjang + " dan lebar = " + lebar + " adalah = "+hitungluas());
    }
    public void keliling(){
        System.out.println("Keliling Persegi Panjang dengan panjang = " + panjang + " dan lebar = " + lebar + " adalah = "+hitungkeliling());
    }

}
package week7;
import week1.Mahasiswa;
import java.time.LocalDate;

public class MahasiswaAktif extends Mahasiswa{
    public int usia;
    public int semester;

    public MahasiswaAktif(String nama, String nim, String tanggal_lahir, int semester){
        super(nim,nama,tanggal_lahir);
        this.semester=semester;
    }
     /*public String getUsia(){
        String tgllhr = super.getTangglLahir();
        String tgl =tgllhr.substring(0,2);
        String bulan = tgllhr.substring(3,5);
        String tahun = tgllhr.substring(6);

        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of
    }*/
    public void getAktif(){
        System.out.println("Nama : "+ getnama());
        System.out.println("nim : "+getnim());
        System.out.println("tanggal lahir : "+gettgl());
        System.out.println("semester : "+ semester);
    }
}
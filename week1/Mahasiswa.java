package week1;
import java.util.ArrayList;
import java.util.Iterator;
import week5.Matakuliah;
public class Mahasiswa

{
    private String nim,nama,tanggal_lahir;
    private int usia;
    //double ipk;
    private ArrayList<Double>nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah>mk = new ArrayList<Matakuliah>();

    // public Mahasiswa(){
    //     this.nim=nim;
    //     this.nama=nama;
    //     this.tanggal_lahir=tanggal_lahir;
    // }
    public Mahasiswa(String nim, String nama ){
        this.nim=nim;
        this.nama=nama;
        //this.ipk=ipk;
    }
    //constructor
    public Mahasiswa(String nim, String nama, String tanggal_lahir ){
        this.nim=nim;
        this.nama=nama;
        this.tanggal_lahir=tanggal_lahir;
        //this.ipk=ipk;
    }
    public void insertNilai(Double nl){
        nilai.add(nl);
    }
    public void insertMatkul(String matkul, String kelompok, int sks){
        mk.add(new Matakuliah(matkul,kelompok,sks));
    }
    public void belajar(){
        System.out.println(nama + " belajar");
    }

    public void mainGame(){
        System.out.println(nama + " main game");
    }
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    public String gettgl(){
        return tanggal_lahir;
    }
   
    public void getIdentitas(){
        System.out.println("Nama mahasiswa: "+ nama);
        System.out.println("NIM mahasiswa: "+ nim);
        //System.out.println("Usia: "+ usia);
        getNilai();
        getMatkul();
    }
    public void getIdentitas2(){
        System.out.println("Nama mahasiswa: "+ nama);
        System.out.println("NIM mahasiswa: "+ nim);
        System.out.println("Tanggal lahir mahasiswa: "+ tanggal_lahir);
        
    }
    public void getNilai(){
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void getMatkul(){
        // Cara 1
        System.out.println("Daftar Mata Kuliah : ");
        for (Matakuliah matkul:mk){
            System.out.println(matkul.getNamaMatkul()+" - "+matkul.getKelompok()+" - "+matkul.getSks());
        }
        // Cara 2
        /*Iterator<Matakuliah> matkul = mk.iterator();
        while(matkul.hasNext()){
            Matakuliah m =matkul.next();
            System.out.println(m.getNamaMatkul()+" - "+m.getKelompok()+" - "+m.getSks());
        }*/
    }


}//cara compile buka terminal (javac week1\Mahasiswa.java)
//cara ngerun (java week1.Mahasiswa)
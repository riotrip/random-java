package latihan;
import java.util.Scanner;
import java.util.Calendar;
public class testing {
public static void main(String [] args) {
    String nama;
    int tahun_lahir;
    int tahun_sekarang;
    int umur;

    Scanner input = new Scanner(System.in);
    Calendar kalender = Calendar.getInstance();
    tahun_sekarang = kalender.get(Calendar.YEAR);
    System.out.print("Masukkan Nama anda: ");
    nama = input.next();
    System.out.print("Masukkan tahun lahir: ");
    tahun_lahir = input.nextInt();
    umur = tahun_sekarang - tahun_lahir;
    System.out.println("Nama anda: "+nama);
    System.out.println("Umur anda adalah: "+umur+" tahun.");
    }    
}
//    public void setNama(String i){
//        this.nama=i;
//    }
//    Siswa anak=new Siswa();
//    Scanner input = new Scanner(System.in);
//    System.out.print("Masukkan Nama anda: ");
//    anak.nama = input.next();
//    System.out.print("Nama anda adalah: "+anak.nama)

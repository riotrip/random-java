package pewarisan;

public class Main_project {
public static void main(String[] args){
    pegawai Pegawai = new pegawai();
    manager Manager = new manager();
    kasir Kasir = new kasir();
    koki Koki = new koki();
    pelayan Pelayan = new pelayan();
    satpam Satpam = new satpam();
    
    Manager.nama="Sifa";
    Manager.id_pegawai=1;
    Manager.gaji="7 Juta";
    Kasir.nama="Aldi";
    Kasir.id_pegawai=2;
    Kasir.gaji="1,2 Juta";
    Koki.nama="Reza";
    Koki.id_pegawai=3;
    Koki.gaji="2 Juta";
    Pelayan.nama="Dean";
    Pelayan.id_pegawai=4;
    Pelayan.gaji="1,2 Juta";
    Satpam.nama="Aldi";
    Satpam.id_pegawai=5;
    Satpam.gaji="1 Juta";
    
    Pegawai.menampilkan();
    
    Manager.menampilkan();
    Manager.tugas();
    Kasir.menampilkan();
    Kasir.tugas();
    Koki.menampilkan();
    Koki.tugas();
    Pelayan.menampilkan();
    Pelayan.tugas();
    Satpam.menampilkan();
    Satpam.tugas();
}
}

package lsp;

import java.util.Scanner;

public class ratarata {
  public static void main(String[] args){
    String nama;
    String alamat;
    int array[], i, num, nis, mm, ipa, bind, bing;
    array = new int[100];
    float rata, tot=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nama siswa: ");
    nama = scan.next();
    System.out.print("Masukkan alamat siswa: ");
    alamat = scan.next();
    System.out.print("Masukkan nis siswa: ");
    nis = scan.nextInt();
    System.out.print("Masukkan nilai matematika: ");
    mm = scan.nextInt();
    System.out.print("Masukkan nilai IPA: ");
    ipa = scan.nextInt();
    System.out.print("Masukkan nilai bahasa indonesia: ");
    bind = scan.nextInt();
    System.out.print("Masukkan nilai bahasa inggris: ");
    bing = scan.nextInt();
    num = 4;
    tot = mm+ipa+bind+bing;
//    for(i = 1; i <= n; i++){
//      System.out.print("Nilai Ke-"+ i +" : ");
//      array[i] = scan.nextInt();
//      total = total + array[i];
//    
    rata = tot/num;
    System.out.println("Siswa bernama :  " + nama);
    System.out.println("Siswa mempunyai alamat :  " + alamat);
    System.out.println("Siswa memiliki nis :  " + nis);
    System.out.println("Memiliki rata-rata nilai : " + rata);
}
}
//}
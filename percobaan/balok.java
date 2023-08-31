package percobaan;

import java.util.Scanner;

public class balok {
public static void main(String[] args){
    int panjang;
    int lebar;
    int tinggi;
    int hasil;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan panjang: ");
    panjang = input.nextInt();
    System.out.print("Masukkan lebar: ");
    lebar = input.nextInt();
    System.out.print("Masukkan tinggi: ");
    tinggi = input.nextInt();
    hasil = (panjang*lebar*tinggi);
    System.out.print("Hasil volume balok adalah = "+hasil);
    }
}




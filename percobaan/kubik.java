package percobaan;

import java.util.Scanner;

public class kubik {

public static void main(String[] args){
    int angka;
    int hasil;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka anda: ");
    angka = input.nextInt();
    hasil = (angka*angka*angka);
    System.out.print("Hasil volume kubus adalah = "+hasil);
    }
}



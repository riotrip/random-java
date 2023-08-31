package percobaan;

import java.util.Scanner;

public class bola {
public static void main(String[] args){
    double jari;
    double hasil;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jari-jari: ");
    jari = input.nextDouble();
    hasil = (jari*jari*jari*22/7*4/3);
    System.out.print("Hasil volume bola adalah = "+hasil);
    }
}

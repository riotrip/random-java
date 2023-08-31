package percobaan;

import java.util.Scanner;

public class ganjilgnp {
public static void main(String[] args){
    int angka;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka anda: ");
    angka = input.nextInt();
    if(angka %2==0){
        System.out.println("Angka tersebut Genap");
    }
    else{System.out.println("Angka tersebut Ganjil");}
}
}
 


package riotrip;

import java.util.Scanner;

public class modul3d {
 public static void main(String[] args) {
      String[] bilangan = new String[5];
      Scanner scan = new Scanner(System.in);
      for(int i = 1; i < bilangan.length; i++){
        System.out.print("Index Ke-"+ i +" : ");
        bilangan[i] = scan.nextLine();
      }
      System.out.println("--------------");
    }
}


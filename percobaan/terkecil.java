package percobaan;

public class terkecil {
    public static void main (String args[]) {
        int[] a = {7,8,9};
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.print("Bilangan terkecil adalah "+min);
    }
}

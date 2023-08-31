package latihan;

public class overloading {
    public void tampil(){
        System.out.println("Method tanpa parameter");
        System.out.println("I LOVE JAVA");
    }
    public void tampil(String nama){
        System.out.println("Method 1 parameter");
        System.out.println(nama);
    }
    public void tampil(String nama1, String nama2){
        System.out.println("Method 2 parameter");
        System.out.println(nama1);
        System.out.println(nama2);
    }
    public void tampil(int j, int i){
        System.out.println("Method 2 parameter");
        System.out.println(j);
        System.out.println(i);
    }
}

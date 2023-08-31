
package latihan;

public class Tabungantes {
    public static void main(String args[]) {
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : "+ tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : "+ tabungan.ambilUang);
        tabungan.saldoakhir(tabungan.saldo-tabungan.ambilUang);
        System.out.println("Saldo sekarang : "+ tabungan.saldoakhir);
    }
}

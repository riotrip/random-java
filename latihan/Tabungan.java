
package latihan;

public class Tabungan {
       int saldo;
       String Tabungan;
       Tabungan(int saldo){
           this.saldo = saldo;
       }
       int ambilUang;
       int saldoakhir;
       
    
    public void setSaldo(int i){
        saldo=i;
    }
    public void setTabungan(String i){
        Tabungan=i;
    } 
    public void ambilUang(int i) {
        ambilUang=i;
    }
     public void saldoakhir(int i) {
        saldoakhir=saldo-ambilUang;
    }
}

package perbankan ;
public class PengambilanUang extends Tabungan {
  private int proteksi ;
  public PengambilanUang ( int saldo ) {
}
  }
  public PengambilanUang ( int saldo , int tingkatBunga ) {
    super.setSaldo ( saldo - tingkatBunga ) ;
    this.proteksi = tingkatBunga ;
  }
  public int getSaldo ( ) {
    return super.getSaldo ( ) + proteksi ;
  }
  public boolean ambilUang ( int jumlah ) {
    if ( jumlah < = super.getSaldo ( ) ) {
      super.setSaldo ( super.getSaldo ( ) - jumlah ) ;
  }
      return true ;
    } else {
    }
      return false ;
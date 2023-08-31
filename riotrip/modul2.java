package riotrip;

            public class modul2 {

                private String nama;
                private int stoc, harga_satuan,harga, total_harga;

                public String getNama() {
                    return nama;
                }

                public void setNama(String nama) {
                    this.nama = nama;
                }

                public int getStoc() {
                    return stoc;
                }

                public void setStoc(int stoc) {
                    this.stoc = stoc;
                }

                public int getHarga_satuan() {
                    return harga_satuan;
                }

                public void setHarga_satuan(int harga_satuan) {
                    this.harga_satuan = harga_satuan;
                }

                public int getHarga() {
                    return harga;
                }

                public void setHarga(int stoc, int harga_satuan) {
                    this.harga = stoc * harga_satuan;
                }

                public int getTotal_harga() {
                    return total_harga;
                }

                public void setTotal_harga(int total_harga) {
                    this.total_harga = total_harga;
                }
                public static void main(String[] args){
              
                    int total_harga;
        
                    modul2 brg1 = new modul2();
                    brg1.setNama("Bolpoint");
                    brg1.setStoc(10);
                    brg1.setHarga_satuan(2000);
                    brg1.setHarga(10, 2000);
                    int a=brg1.getHarga();
        
                    modul2 brg2 = new modul2();
                    brg2.setNama("Pensil");
                    brg2.setStoc(10);
                    brg2.setHarga_satuan(1000);
                    brg2.setHarga(10, 1000);
                    int b=brg2.getHarga();
               
                    modul2 brg3 = new modul2();
                    brg3.setNama("Penghapus");
                    brg3.setStoc(10);
                    brg3.setHarga_satuan(500);
                    brg3.setHarga(10, 500);
                    int c=brg3.getHarga();
        
                    System.out.println("\nNama Alat Tulis = " +brg1.getNama());
                    System.out.println("Stoc            = " +brg1.getStoc());
                    System.out.println("Harga Satuan    = Rp. " +brg1.getHarga_satuan());
                    System.out.println("Harga           = Rp. " +brg1.getHarga());
        
                    System.out.println("\nNama Alat Tulis = " +brg2.getNama());
                    System.out.println("Stoc            = " +brg2.getStoc());
                    System.out.println("Harga Satuan    = Rp. " +brg2.getHarga_satuan());
                    System.out.println("Harga           = Rp. " +brg2.getHarga());
        
                    System.out.println("\nNama Alat Tulis = " +brg3.getNama());
                    System.out.println("Stoc            = " +brg3.getStoc());
                    System.out.println("Harga Satuan    = Rp. " +brg3.getHarga_satuan());
                    System.out.println("Harga           = Rp. " +brg3.getHarga());
        
                    total_harga = a+b+c;
                    System.out.println("\nTotal Harga     = Rp. " +total_harga);
                }
    
            }
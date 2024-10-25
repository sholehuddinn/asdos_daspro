public class keramik {
  public static void main(String[] args) {
    
    // sebuah masjid memiliki ruangan 4 * 6 meter akan di pasang keramik. setiap keramik besar memiliki ukuran 40 cm persegi dan keramik shof ukuran 20 * 40 cm hitung berapa jumlah keramik besar dan keramik shof

    double luasRuangan = 4 * 6; // m^2
    double ukuranKeramikBesar = 0.4; // m
    double ukuranKeramikShof = 0.2 * 0.4; // m

    int jmlKeramikBesar = (int) (luasRuangan / (ukuranKeramikBesar * ukuranKeramikBesar));
    int jmlKeramikShof = (int) (luasRuangan / (ukuranKeramikShof * ukuranKeramikShof));

    System.out.println("Jumlah keramik besar: " + jmlKeramikBesar);
    System.out.println("Jumlah keramik shof: " + jmlKeramikShof);

    // total jumlah keramik
    int totalJmlKeramik = jmlKeramikBesar + jmlKeramikShof;
    System.out.println("Total jumlah keramik: " + totalJmlKeramik);
    
  }
}

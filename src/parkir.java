import java.util.*;

public class parkir {
  public static void main(String[] args) {

    // tugas pertemuan 7

    Scanner scanner = new Scanner(System.in);

    int[][] parkir = {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    System.out.println("== Parkiran Mall ==");

    int count = 0;

    while (true) { 
      for (int i = 0; i < parkir.length; i++){
        for (int j = 0; j < parkir[i].length; j++){
          System.out.print(parkir[i][j] + " ");
          count = (parkir[i][j] == 0) ? count + 1: count;
        }
        System.out.println();
      }

      System.out.println("Ruang Parkir Tersedia " + count);
      count = 0;
      System.out.println("\n(1). Kendaraan Masuk");
      System.out.println("(2). Kendaraan Keluar");

      System.out.print("(1/2): ");
      int pilihan = scanner.nextInt();

      int nomorKendaraan = 0;

      if (pilihan == 1) {
        System.out.print("Masukkan nomor kendaraan: ");
        nomorKendaraan = scanner.nextInt();

        boolean masuk = false;
        for (int i = 0; i < parkir.length; i++){
          for (int j = 0; j < parkir[i].length; j++){
            if (parkir[i][j] == 0) {
              parkir[i][j] = nomorKendaraan;
              System.out.println("Kendaraan " + nomorKendaraan + " berhasil masuk di lokasi: [" + i + "][" + j + "]");
              masuk = true;
              break;
            }
          }
          if (masuk) break;
        }

        if (!masuk) {
          System.out.println("Parkir penuh, kendaraan tidak bisa masuk.");
        }

      } else if (pilihan == 2) {
        System.out.print("Masukkan nomor kendaraan yang keluar: ");
        nomorKendaraan = scanner.nextInt();

        boolean keluar = false;
        for (int i = 0; i < parkir.length; i++){
          for (int j = 0; j < parkir[i].length; j++){
            if (parkir[i][j] == nomorKendaraan) {
              parkir[i][j] = 0;
              System.out.println("Kendaraan " + nomorKendaraan + " berhasil keluar dari lokasi: [" + i + "][" + j + "]");
              keluar = true;
              break;
            }
          }
          if (keluar) break;
        }

        if (!keluar) {
          System.out.println("Kendaraan tidak ditemukan.");
        }
      } else {
        System.out.println("Pilihan tidak valid.");
      }
    }
  }
}

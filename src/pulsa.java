import java.util.*;

public class pulsa {
  public static void main(String[] args) {
    
    // tugas pertemuan 4

    // buatkan program tentang pendapatan admin pulsa saat isi pulsa dengan kriteria berikut :

    // nama kartu: indosat(0857), telkomsel(0822), halo(0811), simpati(0821), By.U(0851)
    // biaya admin pulsa < 50.000 = 2500, > 50.000 = 2000, > 60.000 = 1.500
    // diskon untuk admin membeli pulsa <= 10000 = 1%, <= 50.000 = 2%, > 50.000 = 3%
    // tambahkan fitur Tambah masa aktif (1 minngu = 3000, 1 bulan = 10000) dengan catatan tanpa bunga
    // dapatkan koin untuk setiap transaksi yaitu (nominal / 200)
    
    // input : nomer hp, pilihan pulsa / tambah masa aktif
    // output : nama kartu, biaya, diskon, admin, koin

    Scanner in = new Scanner (System.in);

    String namaKartu = "";

    System.out.print("Masukkan Nomer HP: ");
    String noHP = in.nextLine();

    String nama = noHP.substring(0, 4);

    switch (nama) {
      case "0857":
        namaKartu = "Indosat";
        break;
      case "0822":
        namaKartu = "Telkomsel";
        break;
      case "0811":
        namaKartu = "Halo";
        break;
      case "0821":
        namaKartu = "Simpati";
        break;
      case "0851":
        namaKartu = "By.U";
        break;
      default:
        System.out.println("Nomor HP salah");
        return;
    }

    System.out.println("Kartu " + namaKartu + " di temukan");

    System.out.println("\nPilihan layanan:\n(1) 5.000\n(2) 10.000\n(3) 20.000\n(4) 25.000\n(5) 50.000\n(6) 65.000\n(7) Masa aktif + 1 minggu IDR 3000\n(8) Masa aktif + 1 bulan IDR 10.000");

    System.out.print("INPUT: ");
    int pilihan = in.nextInt();

    int biaya = 0;
    
    switch (pilihan) {
      case 1:
        biaya = 5000;
          break;
      case 2:
        biaya = 10000;
          break;
      case 3:
        biaya = 20000;
          break;
      case 4:
        biaya = 25000;
          break;
      case 5:
        biaya = 50000;
          break;
      case 6:
        biaya = 65000;
          break;
      case 7:
        biaya = 3000;
          break;
      case 8:
        biaya = 10000;
          break;
      default:
        System.out.println("Pilihan layanan salah");
          return;
    }

    int admin = 0;
    
    if (biaya < 50000) {
      admin = 2500;
    } else if (biaya >= 50000 && biaya <= 60000) {
      admin = 2000;
    } else {
      admin = 1500;
    }
    
    double diskon = 0;
    
    if (biaya <= 10000) {
      diskon = 10;
    } else if (biaya > 10000 && biaya < 50000) {
      diskon = 20;
    } else {
      diskon = 30;
    }

    String jenis = "";
    
    if (pilihan == 7 || pilihan == 8) {
      jenis = "Tambah Masa aktif ";
      admin = 0;
    } else {
      jenis = "Pulsa ";
    }

    int total =  biaya + admin;
    int afterdiskon= (int) ((biaya * diskon) / 100);
    int biayaSetelahDiskon = biaya - afterdiskon;
    int pendapatan = total - biayaSetelahDiskon ;
    int koin = total / 200;

    System.out.println("\nKategory\t: " + jenis + namaKartu + " " + biaya);
    System.out.println("No. Hp\t\t: " + noHP);
    System.out.println("Biaya\t\t: " + biayaSetelahDiskon);
    System.out.println("Admin\t\t: " + admin);
    System.out.println("pendapatan\t: " + pendapatan);
    System.out.println("Koin\t\t: " + koin);
    System.out.println("Total bayar\t: " + total);






    

   }
}

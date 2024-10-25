
import java.util.Scanner;

public class pembilangKwitansi {

  // tugas pertemuan 7

  public static String terbilang (int nilai) {
    String[] angka = {" ", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    String temp = "";
    
    if(nilai < 12) {
      temp = " " + angka[nilai];
    }else if(nilai < 20) {
      temp = terbilang(nilai - 10) + " belas";
    }else if (nilai < 100) {
      temp = terbilang((int)Math.floor(nilai / 10)) + " puluh" + terbilang(nilai % 10);
    } else if (nilai < 200) {
      temp = " seratus" + terbilang(nilai - 100);
    } else if (nilai < 1000) {
      temp = terbilang((int)Math.floor(nilai / 100)) + " ratus" + terbilang(nilai % 100);
    } else if (nilai < 2000) {
      temp = " seribu" + terbilang(nilai - 1000);
    } else if (nilai < 1000000) {
      temp = terbilang((int)Math.floor(nilai / 1000)) + " ribu" + terbilang(nilai % 1000);
    } else if (nilai < 1000000000) {
      temp = terbilang((int)Math.floor(nilai / 1000000)) + " juta" + terbilang(nilai % 1000000);
    }
    return temp;
  }
  public static void main(String[] args) {

    // tugas pertemuan 7
    
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan nilai: Rp.");
    int nilai = in.nextInt();

    String hasil = terbilang(nilai);
    System.out.println("Terbilang: " + hasil + " Rupiah");



  


  }
}
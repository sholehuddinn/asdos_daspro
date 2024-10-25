
import java.util.*;

public class pemilu {

  public static void main(String[] args) {

    // tugas pertemuan 5

    Scanner Input = new Scanner(System.in);

    System.out.println("Masukkan Pilihan Anda\n");
    System.out.println("(1). Tarangga Adinata");
    System.out.println("(2). Abdul Rahman Saleh");
    System.out.println("(3). Dwi Saputra");
    System.out.println("(0). keluar");

    int n1 = 0, n2 = 0, n3 = 0, pilihan;

    do { 
      System.out.print("Pilihan: ");
      pilihan = Input.nextInt();
      switch (pilihan) {
        case 1 :
          n1 += 1;
          break;
        case 2 : 
          n2 += 1;
          break;
        case 3 :
          n3 += 1;
          break;
        default:
          System.out.println("pilihan anda tidak ada");
          break;
      }
    }while (pilihan != 0);

    System.out.println("\nHasil Pemilihan:");
    System.out.println("Tarangga Adinata: " + n1 + " orang");
    System.out.println("Abdul Rahman Saleh: " + n2 + " orang");
    System.out.println("Dwi Saputra: " + n3 + " orang");

    

  }
}

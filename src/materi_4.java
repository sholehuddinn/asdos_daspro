import java.util.*;

public class materi_4 {

  public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);

    // if - else statements
    System.out.print("masukkan nilai: ");

    int nilai = in.nextInt();
    
    if (nilai >= 80) {
      System.out.println("Grade: A");
    }else if (nilai < 80  && nilai > 60) {
      System.out.println("Grade: B");
    } else {
      System.out.println("Grade: C");
    }

    // switch case statement
    System.out.print("urutan hari ke-");
    int urutan = in.nextInt();

    switch (urutan) {
      case 1:
        System.out.println("Senin");
        break;
      case 2:
        System.out.println("Selasa");
        break;
      case 3:
        System.out.println("Rabu");
        break;
      case 4:
        System.out.println("Kamis");
        break;
      case 5:
        System.out.println("Jumat");
        break;
      case 6:
        System.out.println("Sabtu");
        break;
      case 7:
        System.out.println("Minggu");
        break;
      default:
        System.out.println("Urutan hari yang anda masukkan salah!");
    }

  }
}

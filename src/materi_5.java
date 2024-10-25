import java.util.*;

public class materi_5 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    System.out.print("masukkan angka: " );
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("literasi for ke-" + i);
    }

    System.out.println("");

    int angkaWhile = 0;

    while (angkaWhile < n) {
      angkaWhile++;
      System.out.println("literasi while ke-" + angkaWhile);
    }

    System.out.println("");
    
    int angkaDoWhile = 0;
    
    do {
      angkaDoWhile++;
      System.out.println("literasi do-while ke-" + angkaDoWhile);
    } while (angkaDoWhile < n);


    // nested for

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("# ");
      }
      System.out.println();
    }


  }
}

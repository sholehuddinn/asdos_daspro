
import java.util.Scanner;

public class materi_6 {

  public static int luasPersegi(int sisi) {
    return sisi * sisi;
  }
  public static void main(String[] args) {

    for(int i = 0; i < 10; i++) {
      System.out.println(i); 
      if (i == 4) {
        break; 
      }
    }

    System.out.println("");

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // Melompati cetakan angka genap
      }
      System.out.println(i); // Hanya mencetak angka ganjil
    }

    System.out.println("");

    int luas = luasPersegi(10);
    System.out.println(luas);
    
    Scanner in = new Scanner (System.in);
    
      System.out.print("Kocak");
      in.nextLine();

  
  }
}

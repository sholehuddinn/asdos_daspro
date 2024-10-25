public class materi_2 {
  public static void main(String[] args) {

    
    // aritmatika operator
    int x = 5;
    int y = 3;

    int penjumlahan = x + y;
    int pengurangan = x - y;
    int perkalian = x * y;
    int pembagian = x / y;
    int modulus = x % y;

    System.out.println("");
    System.out.println("penjumlahan: " + penjumlahan);
    System.out.println("pengurangan: " + pengurangan);
    System.out.println("perkalian: " + perkalian);
    System.out.println("pembagian: " + pembagian);
    System.out.println("modulus: " + modulus);

    // operator assignment
    x += 4;
    y -= 1;

    // x = 5 + 4;

    System.out.println("");
    System.out.println("x: " + x);
    System.out.println("y: " + y);

    // operator relational / pembanding
    int a = 20;

    int b = 25;

    

    boolean lebihKecil = a < b;
    boolean lebihKecilSamaDengan = a <= b;
    boolean samaDengan = a == b;
    boolean lebihBesarSamaDengan = a >= b;
    boolean lebihBesar = a > b;    

    System.out.println("");
    System.out.println("lebih kecil: " + lebihKecil);
    System.out.println("lebih kecil sama dengan: " + lebihKecilSamaDengan);
    System.out.println("sama dengan: " + samaDengan);
    System.out.println("lebih Besar sama dengan: " + lebihBesarSamaDengan);
    System.out.println("lebih besar: " + lebihBesar);
      
    // operator logika          |
    // OR
    System.out.println("");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    // AND
    System.out.println("");
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);


    
    
    // System.out.println(true && true);
    // System.out.println(true && false);
    // System.out.println(false && true);
    // System.out.println(false && false);

    // XOR
    System.out.println("");
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

    // NOT
    System.out.println("");
    System.out.println(!true);
    System.out.println(!false);
    
    // ternary operator
    String ternary = (10 < 5) ? "benar" : "salah";
    System.out.println("\n\t" + ternary);

    // operator precedence / prioritas
    int z = 5 + 3 * 2;
    int w = (5 + 3) * 2;

    System.out.println("\nz: " + z);
    System.out.println("w: " + w);

   

    // hirekari operator
    int h = 10;
    int i = 2;

    System.out.println("");
    System.out.println("h++: " + h++);
    System.out.println("h: " + h);
    System.out.println("++i: " + ++i);
    System.out.println("i: " + i);


    // final
    int j = 10;
    j = 20;
    System.out.println(j);
    
    final int k = 10;
  
    // k = 20; // variabel yang sudah di beri final tidak bisa di rubah / eror



  }
}

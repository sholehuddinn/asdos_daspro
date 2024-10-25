import javax.swing.JOptionPane;

public class materi_3 {
  public static void main(String[] args) {

    // // 1. Fungsi Aritmatika class Math.
    // // Math.abs() - Mengembalikan nilai absolut
    // int nilaiAbsolut = Math.abs(-10);
    // System.out.println("Nilai absolut dari -10: " + nilaiAbsolut);

    // // Math.max() - Mengembalikan nilai terbesar dari dua angka
    // int nilaiMaksimal = Math.max(12, 8);
    // System.out.println("Nilai maksimal antara 5 dan 10: " + nilaiMaksimal);

    // // Math.min() - Mengembalikan nilai terkecil dari dua angka
    // int nilaiMinimal = Math.min(5, 10);
    // System.out.println("Nilai minimal antara 5 dan 10: " + nilaiMinimal); 

    // // Math.sqrt() - Mengembalikan akar kuadrat
    // double akar = Math.sqrt(16);
    // System.out.println("Akar kuadrat dari 16: " + akar); 

    // // Math.pow() - Mengembalikan hasil pemangkatan
    // double pangkat = Math.pow(2, 3);
    // System.out.println("2 pangkat 3: " + pangkat);  

    // // Math.cbrt() - Mengembalikan akar kubik
    // double akarKubik = Math.cbrt(27);
    // System.out.println("Akar kubik dari 27: " + akarKubik); 

    // 2. Fungsi Pembulatan
    // Math.ceil() - Membulatkan ke atas
    // double hasilCeil = Math.ceil(4.3);
    // System.out.println("Membulatkan 4.3 ke atas: " + hasilCeil); 

    // // Math.floor() - Membulatkan ke bawah
    // double hasilFloor = Math.floor(4.8);
    // System.out.println("Membulatkan 4.8 ke bawah: " + hasilFloor); 

    // // Math.round() - Membulatkan ke bilangan bulat terdekat
    // double hasilRound = Math.round(4.5);
    // System.out.println("Membulatkan 4.5 ke bilangan bulat terdekat: " + hasilRound);  


    // 3. Fungsi Trigonometri
    // // Math.sin() - Mengembalikan nilai sinus dari sudut dalam radian
    // double sinus = Math.sin(Math.PI / 2);
    // System.out.println("Nilai sinus dari PI/2: " + sinus);  

    // // Math.cos() - Mengembalikan nilai cosinus dari sudut dalam radian
    // double cosinus = Math.cos(Math.PI);
    // System.out.println("Nilai cosinus dari PI: " + cosinus);
    
    // Math.random() - membuat angka rendom
    // double random = Math.random();
    // System.out.println("Angka random: " + Math.ceil(random * 100));
    
    
    // Scanner scanner = new Scanner(System.in);
    
    // // Membaca integer
    // System.out.print("Masukkan angka (integer): ");
    // int angka = scanner.nextInt();
    // System.out.println("Anda memasukkan angka: " + angka);

    // // Membaca double
    // System.out.print("Masukkan angka desimal (double): ");
    // double desimal = scanner.nextDouble();
    // System.out.println("Anda memasukkan angka desimal: " + desimal);

    // Membaca string (kata pertama)
    // System.out.print("Masukkan kata (String): ");
    // String kata = scanner.nextLine();
    // System.out.println("Anda memasukkan kata: " + kata);

    // // Membaca kalimat (hingga newline)
    // scanner.nextLine(); // Membersihkan newline dari buffer
    // System.out.print("Masukkan kalimat: ");
    // String kalimat = scanner.nextLine();
    // System.out.println("Anda memasukkan kalimat: " + kalimat);

    // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // try {
    //   // Membaca integer
    //   System.out.print("Masukkan angka (integer): ");
    //   int angka = Integer.parseInt(reader.readLine());
    //   System.out.println("Anda memasukkan angka: " + angka);

    //   // Membaca double
    //   System.out.print("Masukkan angka desimal (double): ");
    //   double desimal = Double.parseDouble(reader.readLine());
    //   System.out.println("Anda memasukkan angka desimal: " + desimal);

    //   // Membaca string
    //   System.out.print("Masukkan teks (String): ");
    //   String teks = reader.readLine();
    //   System.out.println("Anda memasukkan teks: " + teks);

    // } catch (IOException e) {
    //   System.out.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
    // } finally {
    //   try {
    //     reader.close();
    //   } catch (IOException e) {
    //     System.out.println("Terjadi kesalahan saat menutup BufferedReader: " + e.getMessage());
    //   }
    // }

    // j option pane
    String inputAngka = JOptionPane.showInputDialog("Masukkan angka (integer):");
    int angka = Integer.parseInt(inputAngka);
    JOptionPane.showMessageDialog(null, "Anda Memasukkan angka "  + angka);

    // Membaca double
    String inputDesimal = JOptionPane.showInputDialog("Masukkan angka desimal (double):");
    double desimal = Double.parseDouble(inputDesimal);
    JOptionPane.showMessageDialog(null, "Anda memasukkan angka desimal: " + desimal);

    // Membaca string
    String teks = JOptionPane.showInputDialog("Masukkan teks (String):");
    JOptionPane.showMessageDialog(null, "Anda memasukkan teks: " + teks);

  }
}

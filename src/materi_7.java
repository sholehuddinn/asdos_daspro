public class materi_7 {
  public static void main(String[] args) {
    
    int[] data = new int[3];

    data[0] = 10;
    data[1] = 20;
    data[2] = 30;

    int[] data2 = {15, 30, 45};

    // for biasa
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }

    // for-each 
    for (int value : data2) {
      System.out.println(value);
    }

    // array multidimensi

    // data 1 = nama
    // data 2 = nama ibu
    // data 3 = tempat tinggal
    // di tampung dalam 1 array

    String[][] data3 = {
      {"Fuad", "Ibu Pertiwi", "Sidoarjo"},
      {"Joko", "Ibu Ketut", "Malang"},
      {"Sugio", "Ibu Karya", "Jakarta"}
    };

    // for-each multidimensi
    for (String[] row : data3) {
      for (String value : row) {
        System.out.println(value);
      }
    }

    for (int i = 0; i < data3.length; i++){
      System.out.println("Nama: " + data3[0][i]);
      System.out.println("Nama Ibu: " + data3[1][i]);
      System.out.println("Tempat Tinggal: " + data3[2][i]);
      System.out.println("");
    }

    


  }
}

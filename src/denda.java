
import java.util.Scanner;

public class denda {
  public static void main(String[] args) {

  // tugas pertemuan 3

  Scanner in = new Scanner(System.in);

  System.out.println("Suhu dalam celcius: ");
  double c = in.nextDouble();

  double f = (c * 9/5) + 32;
  System.out.println("Suhu dalam fahrenheit: " + f);

  double r = (4 * c) / 5;
  System.out.println("Suhu dalam reamur: " + r);

  double k = c + 273;
  System.out.println("Suhu dalam kelvin: " + k);
  }
}
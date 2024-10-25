package main;

import java.util.Scanner;

public class app {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    manusia orang1 = new manusia();

    System.out.print("Masukkan jumlah orang yang di hitung : ");
    int count = in.nextInt();

    for (int i = 1; i <= count; i++) {
      System.out.println("\nInput Data " + i);
      System.out.print("Masukkan tinggi badan (Cm) : ");
      orang1.setTinggiBadan(in.nextDouble());
  
      System.out.print("Masukkan berat badan (Kg)  : ");
      orang1.setBeratBadan(in.nextDouble());
  
      System.out.println("\nData Orang ke-" + i);
      System.out.println("Berat Badan : " + orang1.getBeratBadan());
      System.out.println("Tinggi Badan : " + orang1.getTinggiBadan());
      System.out.println("BMI : " + orang1.hitungBMI());
      System.out.println("Status : " + orang1.setStatus());
    }
  }
}

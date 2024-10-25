package main;

public class manusia {
  private double tinggiBadan;
  private double beratBadan;

  public void setTinggiBadan(double tinggi) {
    tinggiBadan = tinggi;
  }

  public void setBeratBadan(double berat) {
    beratBadan = berat;
  }
  
  public double getTinggiBadan() {
    return tinggiBadan;
  }

  public double getBeratBadan() {
    return beratBadan;
  }

  public double hitungBMI() {
    return beratBadan / Math.pow((tinggiBadan / 100), 2);
  }

  public String setStatus() {
    String status;
    if (hitungBMI() < 18.5) {
      status = "Kurus";
    } else if (hitungBMI() >= 18.5 && hitungBMI() <= 24.9) {
      status = "Normal";
    } else if (hitungBMI() >= 25 && hitungBMI() <= 29.9) {
      status = "Kelebihan Berat Badan";
    } else {
      status = "Obesitas";
    }
    return status;
  }
}

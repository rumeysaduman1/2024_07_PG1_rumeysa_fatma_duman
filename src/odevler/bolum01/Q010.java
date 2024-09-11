package odevler.bolum01;

public class Q010 {
 public static  void main(String [] args) {
     double distanceKilometers = 14;
     double timeMinute = 45;
     double timeSecond = 30;
      double distanceMiles = distanceKilometers / 1.6;
      double totalTimeInHours = (timeMinute / 60) + (timeSecond / 3600);
      double averageSpeedMph = distanceMiles / totalTimeInHours;

     System.out.printf(" the avarage speed is %.2f miles per hour.%n " , averageSpeedMph);

 }

}

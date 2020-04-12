import java.util.Scanner;
public class Example  {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = scan.nextDouble();
      System.out.print("\nInput height in meters: ");
      double height = scan.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("BMI is " + BMI + " kg/m2");
   }
}
import java.util.Scanner;

public class StepCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    double x, y, xs, xg, dx;
    
    try {
      System.out.print("from: ");
      xs = sc.nextDouble();
      System.out.print("to: ");
      xg = sc.nextDouble();
      System.out.print("step: ");
      dx = sc.nextDouble();
      sc.close();
    }
    catch(Exception ex) {
      System.out.println("input-output error");
      sc.close();
      return;
    }

    for (x=xs; x<=xg+dx/2; x=x+dx) {
      x = Math.round(x*1000)*0.001;
      if(Math.abs(3*x-6) < 0.0001) {
        System.out.printf("%.2f\tnot defined%n", 2.0);
      } else if (x<0) {
        System.out.printf("%.2f\tnot defined%n", x);
      } else {
        y=Math.sqrt(x)/(3*x-6);
        System.out.printf("%.2f\t%.2f%n", x, y);
      }
    }
  }

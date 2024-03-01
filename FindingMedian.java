import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.print("a=");
    a = sc.nextInt();
    System.out.print("b=");
    b = sc.nextInt();
    System.out.print("c=");
    c = sc.nextInt();

    int median;
  
    if (a<=b && a>=c || a>=b && a<=c) {
      median = a;
    } else if (b<=a && b>=c || b>=a && b<=c) {
      median = b;
    } else {
      median = c;
    }
      

    System.out.println(median);
    sc.close();
  }
}

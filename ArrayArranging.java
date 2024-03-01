import java.util.Scanner;

public class ArrayArranging {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[20];
		int k;
     
		k = sc.nextInt();
    
    if (k <= 0) {
      for (int i = 0; i < 20; i++) {
        a[i] = sc.nextInt();
      }
    }
    else {
      for (int i = 0; i < 20; i++) {
        a[i] = i % (k+1);
      }
    }
    for (int i = 0; i < 20; i++) {
      System.out.print(a[i] + " ");
    }
    int count=0;
    for (int i = 0; i < 20; i++) {
      if (a[i] != 0) {
        int b = a[i];
        a[i] = a[count];
        a[count] = b;
        count++;
      }
    }
    System.out.println();
    for (int i=0; i<20; i++) {
      System.out.print(a[i] + " ");
    }
    
    sc.close();
	}

}

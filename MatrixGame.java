import java.util.Random;
import java.util.Scanner;

public class MatrixGame {

	public static void main(String[] args) {
		double a[][] = {{0.5, 0.5, 0.5, 0.5, 0.5},
                    {0, 1, 0, 1, 1},
                    {0.5, 1, 0.5, 0.5, 0},
                    {0, 0.5, 0, 0.5, 0},
                    {1, 1, 1, 1, 1},
                    {0, 0, 0, 0.5, 0.5},
                    {0, 0.5, 0, 0, 1}};
		int i, j;
		int ch;
		
		System.out.print("mode (1, 2 or 3): ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
				
		Random rnd = new Random();
		
		switch (ch) {
  		case 1 -> {
  		  // ievadīt masīva elementus no tastatūras
        for (i = 0 ; i < 7 ; i++) {
          for (j = 0; j < 5; j++) {
            a[i][j]=sc.nextDouble();
          }
        }
        break;
      } 
  		case 2 -> {
  			//	aizpildīt masīvu ar nejaušiem skaitļiem
        for (i = 0 ; i < 7 ; i++) {
           for (j = 0; j < 5; j++) {
             a[i][j]=rnd.nextInt(3) * 0.5;
           }
        }
        break;
      }
  		case 3 -> {
        //  masīvs paliek kāds ir
        break;
      }
  		default -> {
  			System.out.println("mode error");
  			sc.close();
  			return;
      }
  	}
		
		for (i = 0; i < 7; i++) {
      for (j = 0; j < 5; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("result:");
    System.out.print("numbers: ");
    int count = 0;
    for (i = 0; i < 7; i++) {
      boolean hasLost = false;
      for (j = 0; j < 5; j++) {
        if (a[i][j] == 0.0) {
          hasLost = true;
          break;
        }
      }
      if (!hasLost) {
        count++;
        System.out.print((i + 1) + " ");
      }
    }
    System.out.println();
    System.out.println("count: " + count);
    sc.close();
	}
}

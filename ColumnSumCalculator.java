import java.util.Scanner;

class ColumnSumCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row, col;
    row = sc.nextInt();
    col = sc.nextInt();
    int[][] a = new int[row][col];
    
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = i+j+1;
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    int sum =0;
    int j = 1;
    
    while (j < col) {
      for (int i = 0; i < a.length; i++) {
        sum += a[i][j];
      }
      j += 2;
    }
    System.out.println("sum=" + sum);
    sc.close
  }
}

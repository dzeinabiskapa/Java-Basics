import java.util.Scanner;
class ZeroPositionFinder {
  static Scanner sc;
  public static int[] a;

  public static void inputArray(int[] a, int i) {
    if (i < a.length) {
      a[i] = sc.nextInt();
      inputArray(a, i+1);
    }
  }

  public static int ZeroPos(int i, int LastPos) {
    if (i < a.length) {
      if (a[i]==0) {
        LastPos = i+1;
      }
      return ZeroPos(i+1, LastPos);
    } else {
      return LastPos;
    }
  }
  
  public static void main(String[] args) {
    sc = new Scanner(System.in);
    System.out.println("Džeina Bīskapa");
		
		System.out.print("count:" );
		int count = sc.nextInt();
    
		System.out.println("numbers:");
    a = new int[count];
    inputArray(a, 0);
    
	  System.out.print("result: ");
    int result = ZeroPos(0, 0);
		System.out.println(result);
    sc.close();
  }
}

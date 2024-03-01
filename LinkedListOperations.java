import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkedListOperations {
  private static void atstarpePrint(List<Integer> list) {
      for (int num : list) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

  private static void SumBlakusEl(List<Integer> list) {
      for (int i = 0; i < list.size() - 1; i += 2) {
          int sum = list.get(i) + list.get(i + 1);
          list.add(i + 1, sum);
      }
  }
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<Integer> list = new LinkedList<Integer>();
      int number;

      while (true) {
          number = sc.nextInt();
          if (number == 0) {
              break;
          }
          list.add(number);
      }

      System.out.println("result:");
      atstarpePrint(list);
      SumBlakusEl(list);
      atstarpePrint(list);

      sc.close();
  }
}

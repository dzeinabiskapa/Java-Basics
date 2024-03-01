import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTranslator {
  static public Map<String, String> morze = new HashMap<String, String>();

  private static String MorseCode(String text, Map<String, String> morzeMap) {
      String result = "";

      for (char character : text.toCharArray()) {
        String charString = String.valueOf(character);
        if (morzeMap.containsKey(charString)) {
          result += morzeMap.get(charString) + " ";
        } else if (character == ' ') {
          result += " ";
        }
      }
      return result;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String text = sc.nextLine();
    text = text.toUpperCase();
    sc.close();

    String result = MorseCode(text, morze);

    System.out.println(result);
  }

  static {
    morze.put("A", ".-");       morze.put("S", "...");
    morze.put("B", "-...");     morze.put("T", "-");
    morze.put("C", "-.-.");     morze.put("U", "..-");
    morze.put("D", "-..");      morze.put("V", "...-");
    morze.put("E", ".");        morze.put("W", ".--");
    morze.put("F", "..-.");     morze.put("X", "-..-");
    morze.put("G", "--.");      morze.put("Y", "-.--");
    morze.put("H", "....");     morze.put("Z", "--..");
    morze.put("I", "..");       morze.put("0", "-----");
    morze.put("J", ".---");     morze.put("1", ".----");
    morze.put("K", "-.-");      morze.put("2", "..---");
    morze.put("L", ".-..");     morze.put("3", "...--");
    morze.put("M", "--");       morze.put("4", "....-");
    morze.put("N", "-.");       morze.put("5", ".....");
    morze.put("O", "---");      morze.put("6", "-....");
    morze.put("P", ".--.");     morze.put("7", "--...");
    morze.put("Q", "--.-");     morze.put("8", "---..");
    morze.put("R", ".-.");      morze.put("9", "----.");
  }
}

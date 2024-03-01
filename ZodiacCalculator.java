import java.util.Scanner;

class ZodiacCalculator {
  private static String ZodiakZime(int diena, int menesis) {
      if ((menesis == 1 && diena >= 20) || (menesis == 2 && diena <= 18)) {
          return "ūdensvīrs";
      } else if ((menesis == 2 && diena >= 19) || (menesis == 3 && diena <= 20)) {
          return "zivis";
      } else if ((menesis == 3 && diena >= 21) || (menesis == 4 && diena <= 19)) {
          return "auns";
      } else if ((menesis == 4 && diena >= 20) || (menesis == 5 && diena <= 20)) {
          return "vērsis";
      } else if ((menesis == 5 && diena >= 21) || (menesis == 6 && diena <= 21)) {
          return "dvīņi";
      } else if ((menesis == 6 && diena >= 22) || (menesis == 7 && diena <= 22)) {
          return "vēzis";
      } else if ((menesis == 7 && diena >= 23) || (menesis == 8 && diena <= 22)) {
          return "lauva";
      } else if ((menesis == 8 && diena >= 23) || (menesis == 9 && diena <= 22)) {
          return "jaunava";
      } else if ((menesis == 9 && diena >= 23) || (menesis == 10 && diena <= 22)) {
          return "svari";
      } else if ((menesis == 10 && diena >= 23) || (menesis == 11 && diena <= 22)) {
          return "skorpions";
      } else if ((menesis == 11 && diena >= 23) || (menesis == 12 && diena <= 21)) {
          return "strēlnieks";
      } else {
          return "mežāzis";
      }
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dz_datums = sc.next();

        String diena_string = dz_datums.substring(0, 2);
        String menesis_string = dz_datums.substring(3, 5);

        int diena = Integer.parseInt(diena_string);
        int menesis = Integer.parseInt(menesis_string);

        String zodiaks = ZodiakZime(diena, menesis);

        System.out.println(zodiaks);

        sc.close();
    }
}

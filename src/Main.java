import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alphabetic);

        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        while (play == true) {
            System.out.println("Type x om te stoppen.");
            System.out.println("Type v om te vertalen.");

            String input = scanner.nextLine();

            if (Objects.equals(input, "x")){
                play = false;
            }
            else if (Objects.equals(input, "v")){
                System.out.println("Voer een cijfer in van 0 t/m 9");
                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                if (inputGrade < 10){
                    String result = translator.translate(inputGrade);
                    System.out.println(result);
                } else {
                    System.out.println("Voer een cijfer tussen de 0 en de 9 in.");
                }

            } else {
                System.out.println("Ongeldige invoer, voer een x of een v in.");
        }
    }
}}

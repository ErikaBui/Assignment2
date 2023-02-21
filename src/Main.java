import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseCode morseCode = new MorseCode();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Skriv något antingen på morsekod eller engelska: ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            morseCode.handleInput(input);
        }
    }
}
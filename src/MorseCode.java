import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private Map<String, String> morseCodeTable = new HashMap<String, String>();

    public MorseCode() {
        morseCodeTable.put("A", "*-");
        morseCodeTable.put("B", "-***");
        morseCodeTable.put("C", "-*-*");
        morseCodeTable.put("D", "-**");
        morseCodeTable.put("E", "*");
        morseCodeTable.put("F", "**-*");
        morseCodeTable.put("G", "--*");
        morseCodeTable.put("H", "****");
        morseCodeTable.put("I", "**");
        morseCodeTable.put("J", "*---");
        morseCodeTable.put("K", "-*-");
        morseCodeTable.put("L", "*-**");
        morseCodeTable.put("M", "--");
        morseCodeTable.put("N", "-*");
        morseCodeTable.put("O", "---");
        morseCodeTable.put("P", "*--*");
        morseCodeTable.put("Q", "--*-");
        morseCodeTable.put("R", "*-*");
        morseCodeTable.put("S", "***");
        morseCodeTable.put("T", "-");
        morseCodeTable.put("U", "**-");
        morseCodeTable.put("V", "***-");
        morseCodeTable.put("W", "*--");
        morseCodeTable.put("X", "-**-");
        morseCodeTable.put("Y", "-*--");
        morseCodeTable.put("Z", "--**");
        morseCodeTable.put("1", "*----");
        morseCodeTable.put("2", "**---");
        morseCodeTable.put("3", "***--");
        morseCodeTable.put("4", "****-");
        morseCodeTable.put("5", "*****");
        morseCodeTable.put("6", "-****");
        morseCodeTable.put("7", "--***");
        morseCodeTable.put("8", "---**");
        morseCodeTable.put("9", "----*");
        morseCodeTable.put("0", "-----");
        morseCodeTable.put(".", "*-*-*-");
        morseCodeTable.put(",", "--**--");
        morseCodeTable.put("?", "**--**");
    }

    public String handleInput(String input) {
        String isEnglishRegex = "^[ \\w \\d \\s \\. \\& \\+ \\- \\, \\! \\@ \\# \\$ \\% \\^ \\* \\( \\) \\; \\\\ \\/ \\| \\< \\> \\\" \\' \\? \\= \\: \\[ \\] ]*$";
        if (input.isEmpty()) {
            System.out.println("Du måste skriva in minst ett tecken");
            return "";
        }
        else if (!input.matches(isEnglishRegex)) {
            System.out.println("Din text innehåller ogiltiga tecken. Endast bokstäver i det engelska alfabetet är tillåtet");
            return "";
        }
        else if (isMorseCode(input)) {
            return Decode((input));
        }
        else {
            return Encode(input);
        }
    }

    public String Decode(String input) {
        // array exempel innehåll:
        // ["*-*", "-", "*"]
        var inputArray = input.split(" ");
        String decodedString = "";

        for (int i = 0; i < inputArray.length; i++) {
            // Loopa över hashmapen och kolla om värdet matchar array[i]
            for (Map.Entry<String, String> entry : morseCodeTable.entrySet()) {
                if (entry.getValue().equals(inputArray[i])) {
                    // System.out.println("The Key for '" + inputArray[i] + "' is " + entry.getKey());
                    decodedString += entry.getKey();
                }
            }
        }
        System.out.println(decodedString);
        return decodedString;
    }

    public String Encode(String input) {
        var inputArray = input.split("");
        String encodedString = "";

        for (int i = 0; i < inputArray.length; i++) {
            // Loopa över hashmapen och kolla om värdet matchar array[i]
            for (Map.Entry<String, String> entry : morseCodeTable.entrySet()) {
                if (entry.getKey().equals(inputArray[i].toUpperCase())) {
                    // System.out.println("The Key for '" + inputArray[i] + "' is " + entry.getKey());
                    encodedString += entry.getValue();
                }
            }
        }
        System.out.println(encodedString);
        return encodedString;
    }

    public boolean isMorseCode(String s) {
            if (s.contains("*") || s.contains("-")) {
                if (s.matches(".*[a-zA-Z0-9]+.*")) {
                    return false;
                }
            else return true;
        }
        return false;
    }
}

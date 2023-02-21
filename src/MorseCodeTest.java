import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    @Test
    public void EmptyInput() {
        // Arrange
        MorseCode morseCode = new MorseCode();
        String expected = "";


        // Act
        String actual = morseCode.handleInput("");

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void MorseCodeInput() {
        // Arrange
        MorseCode morseCode = new MorseCode();
        String expected = "HEJ";

        // Act
        String actual = morseCode.handleInput("**** * *---");

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void EndCode() {
        // Arrange
        MorseCode morseCode = new MorseCode();
        String expected = "*";

        // Act
        String actual = morseCode.handleInput("E");

        //Assert
        assertEquals(expected, actual);
    }
}

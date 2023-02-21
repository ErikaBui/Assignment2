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
    public void Decode() {
        // Arrange
        MorseCode morseCode = new MorseCode();
        String expected = "HEJ";
        // Act
        String actual = morseCode.handleInput("**** * *---");
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void Encode() {
        // Arrange
        MorseCode morseCode = new MorseCode();
        String expected = "*";
        // Act
        String actual = morseCode.handleInput("E");
        //Assert
        assertEquals(expected, actual);
    }
}

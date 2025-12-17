import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainSpec {

    private Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    @DisplayName("Test methodToTest execution")
    public void methodToTest() {

        boolean result = main.methodToTest();
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test methodToTest execution1")
    public void methodToTest1() {

        boolean result = main.methodToTest();
        Assertions.assertTrue(result);
    }
}

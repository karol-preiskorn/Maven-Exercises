import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HelloWorldTest {

    @Test
    @DisplayName(value = "> main")
    void mainTest() {
        System.out.println("Do Main test");
    }

    @Test
    @DisplayName(value = "> go")
    void goTest() {
        System.out.println("Do go test");
        assertEquals (4, HelloWorld.go(2, 2));
    }

}


package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorTest {

    @Test
    public void testSuccess() {
       Application app = new Application();
        String response = app.calculate("1+1");
        assertTrue(response.contains("2.0"));
    }

    @Test
   public void testFailure() {
        Application app = new Application();
        String response = app.calculate("5-1");
        assertTrue(response.contains("4.0"));
    }
}
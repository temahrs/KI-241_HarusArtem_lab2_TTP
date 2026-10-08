package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorTest {

    @Test
    public void testSuccess() {
        double result = new ExpressionBuilder("1+1").build().evaluate();
        assertEquals(2.0, result);
    }

    @Test
    public void testFailure() {
        double result = new ExpressionBuilder("5-1").build().evaluate();
        assertEquals(4.0, result);
    }
}
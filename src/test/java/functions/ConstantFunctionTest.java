package functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConstantFunctionTest {
    MathFunction x = new ConstantFunction(10);
    @Test
    public void testApply() {
        assertEquals(x.apply(5), 10, 0.0001);
    }

    @Test
    public void testGetConstant() {
        assertEquals(((ConstantFunction)x).getConstant(), 10, 0.0001);
    }
}

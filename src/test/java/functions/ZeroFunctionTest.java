package functions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ZeroFunctionTest {

    @Test
    public void testApply() {
        MathFunction x = new ZeroFunction();
        assertEquals(x.apply(5), 0, 0.0001);
    }
}

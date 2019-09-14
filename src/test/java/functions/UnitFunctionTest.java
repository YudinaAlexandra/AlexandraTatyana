package functions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UnitFunctionTest {

    @Test
    public void testApply() {
        MathFunction x = new UnitFunction();
        assertEquals(x.apply(5), 1, 0.0001);
    }
}

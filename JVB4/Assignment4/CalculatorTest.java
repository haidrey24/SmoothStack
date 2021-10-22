

import static org.junit.Assert.assertNull;

public class CalculatorTest {

  Calculator calc = new Calculator();

  @Test
  public void addNullTest() {
    assertNull(calc.add(10,null));
    assertNull(calc.add(null, 10));

  }
}

package week_16.test;

import org.junit.jupiter.api.Test;
import week_16.java.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Trying {
    @Test
    void testAddMetod(){
      int result = Calculator.add(5,7);
      assertEquals(result,12,"Test case_01 is invalid");
    }
}

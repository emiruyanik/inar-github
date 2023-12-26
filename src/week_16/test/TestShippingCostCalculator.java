package week_16.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import week_16.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestShippingCostCalculator {
    @BeforeAll
    public static void Open(){
        System.out.println("Test started");
    }
    @AfterAll
    public static void Close(){
        System.out.println("Test closed");
    }
    @Test
    public void testLocalDestinationWithStandardDelivery() {
        // Arrange
        ShippingCostCalculator testCase1 = new ShippingCostCalculator();
        double expectedCost = 2.0;

        // Act
        double actualCost = testCase1.calculateCost(2.0, "Local", "Standard");

        // Assert
        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly"); // İkinci parametre fark toleransını ifade eder.
    }
    @Test
    public void TestLocalDestinationWithExpressDelivery(){
        ShippingCostCalculator testCase2=new ShippingCostCalculator();
        double expectedCost=5.0;

        double actualCost=testCase2.calculateCost(2,"Local","Express");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");

    }
    @Test
   void testInternationalDestinationWithStandardDelivery(){
        ShippingCostCalculator testCase3=new ShippingCostCalculator();
        double expectedCost=10.0;

        double actualCost=testCase3.calculateCost(2,"International","Standard");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testInternationalDestinationWithExpressDelivery(){
        ShippingCostCalculator testCase4=new ShippingCostCalculator();
        double expectedCost=25.0;

        double actualCost=testCase4.calculateCost(2,"International","Express");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testZeroWeightLocalStandardDelivery(){
        ShippingCostCalculator testCase5=new ShippingCostCalculator();
        double expectedCost=0.0;

        double actualCost=testCase5.calculateCost(0,"Local","Standard");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testZeroWeightLocalExpressDelivery(){
        ShippingCostCalculator testCase6=new ShippingCostCalculator();
        double expectedCost=0.0;

        double actualCost=testCase6.calculateCost(0,"Local","Express");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testZeroWeightInternationalStandardDelivery(){
        ShippingCostCalculator testCase7=new ShippingCostCalculator();
        double expectedCost=0.0;

        double actualCost=testCase7.calculateCost(0,"International","Standard");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testZeroWeightInternationalExpressDelivery(){
        ShippingCostCalculator testCase8=new ShippingCostCalculator();
        double expectedCost=0.0;

        double actualCost=testCase8.calculateCost(0,"International","Express");

        assertEquals(expectedCost, actualCost, 0.001,"The calculateCost method is not working properly");
    }
    @Test
    void testNegativeWeightLocalStandardDelivery(){
        ShippingCostCalculator testCase9=new ShippingCostCalculator();


        assertThrows(IllegalArgumentException.class,()->testCase9.calculateCost(-1,"Local","Standard"),
                "Developer forgot to throw IllegalArgumentException");
    }
    @Test
    void testNegativeWeightLocalExpressDelivery(){
        ShippingCostCalculator testCase10=new ShippingCostCalculator();


        assertThrows(IllegalArgumentException.class,()->testCase10.calculateCost(-2,"Local","Express"),
                "Developer forgot to throw IllegalArgumentException");
    }
    @Test
    void testNegativeWeightInternationalStandardDelivery(){
        ShippingCostCalculator testCase11=new ShippingCostCalculator();


        assertThrows(IllegalArgumentException.class,()->testCase11.calculateCost(-0.5,"International","Standard"),
                "Developer forgot to throw IllegalArgumentException");
    }
    @Test
    void testNegativeWeightInternationalExpressDelivery(){
        ShippingCostCalculator testCase12=new ShippingCostCalculator();


        assertThrows(IllegalArgumentException.class,()->testCase12.calculateCost(-1,"International","Express"),
                "Developer forgot to throw IllegalArgumentException");
    }
}

package week_16.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import week_16.java.OrderStatusManager;
import week_16.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParametrizedTestForOrderStatusManager {
    private static int testCaseNumber = 1;

    @BeforeAll
    public static void testStarted() {
        System.out.println("Test started");
    }

    @AfterAll
    public static void testFinished() {
        System.out.println("Test finished");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("------------------TC-" + testCaseNumber + ": is started---------------");

    }

    @AfterEach
    public void tearDown() {
        System.out.println("------------------TC-" + testCaseNumber + ": is finished--------------");
        System.out.println("#################################################");
        testCaseNumber++;
    }

    @ParameterizedTest
    @ValueSource(strings = {"NEW", "PENDING"})
    public void testCancellation(String status) {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.valueOf(status));
        OrderStatusManager.OrderState orderStateIsCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.valueOf(status));
        assertEquals(orderStateIsCancelled, OrderStatusManager.OrderState.CANCELLED, "The order should have been cancelled");

    }

    @ParameterizedTest
    @ValueSource(strings = {"SHIPPED", "DELIVERED"})
    public void testUncellation(String status) {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.valueOf(status));
        OrderStatusManager.OrderState orderStateUncancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.valueOf(status));
        assertNotEquals(orderStateUncancelled, OrderStatusManager.OrderState.CANCELLED, "The order should not have been cancelled");
    }
}

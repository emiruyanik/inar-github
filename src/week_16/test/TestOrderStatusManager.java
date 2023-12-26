package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.OrderStatusManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestOrderStatusManager {
    static int counter = 1;

    @BeforeAll
    static void start() {
        System.out.println("Test started");
    }

    @AfterAll
    static void finish() {
        System.out.println("Test finished");
    }

    @BeforeEach
    void createObjectOrderStatusManager() {
        System.out.println("Test case " + counter + " is running");

    }

    @AfterEach
    void assignObjectOrderStatusManagerToNull() {
        System.out.println("Test case " + counter + " finished");
        counter++;
    }

    @Test
    void testNextStateTransitionFromNew() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        OrderStatusManager.OrderState nextState = orderStatusManager.nextState();
        assertEquals(OrderStatusManager.OrderState.PENDING, nextState, "State should transcend from new to pending");

    }

    @Test
    void testTransitionFromPendingToShipped() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        OrderStatusManager.OrderState nextState = orderStatusManager.nextState();
        assertEquals(nextState, OrderStatusManager.OrderState.SHIPPED, "State should transcend from pending to shipped");
    }

    @Test
    void testTransitionFromShippedToDelivered() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        OrderStatusManager.OrderState nextState = orderStatusManager.nextState();
        assertEquals(nextState, OrderStatusManager.OrderState.DELIVERED, "State should transcend from shipped to delivered");
    }

    @Test
    void testNoTransitionFromDelivered() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        OrderStatusManager.OrderState nextState = orderStatusManager.nextState();
        assertEquals(nextState, OrderStatusManager.OrderState.DELIVERED, "State should not transcend from delivered to delivered");

    }

    @Test
    void testNoTransitionFromCancelled() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        OrderStatusManager.OrderState nextState = orderStatusManager.nextState();
        assertEquals(nextState, OrderStatusManager.OrderState.CANCELLED, "State should not cancelled from delivered to cancelled");
    }

    @Test
    void testCancelFromNewState() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        OrderStatusManager.OrderState isCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.NEW);
        assertEquals(isCancelled, OrderStatusManager.OrderState.CANCELLED, "The order should have been cancelled");
    }

    @Test
    void CancelFromPendingState() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        OrderStatusManager.OrderState isCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.PENDING);
        assertEquals(isCancelled, OrderStatusManager.OrderState.CANCELLED, "The order should have been cancelled");
    }

    @Test
    void testNoCancellationFromShippedState() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        OrderStatusManager.OrderState isCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.SHIPPED);
        assertNotEquals(isCancelled, OrderStatusManager.OrderState.CANCELLED, "The order should not have been cancelled");
    }

    @Test
    void testNoCancellationFromDeliveredState() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        OrderStatusManager.OrderState isCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.DELIVERED);
        assertNotEquals(isCancelled, OrderStatusManager.OrderState.CANCELLED, "The order should not have been cancelled");
    }

    @Test
    void testNoCancellationFromAlreadyCancelledState() {
        OrderStatusManager orderStatusManager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        OrderStatusManager.OrderState isCancelled = orderStatusManager.cancelOrder(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(isCancelled, OrderStatusManager.OrderState.CANCELLED, "Cancellation should not be allowed from already cancelled state");
    }
}


package week_16.test;

import org.junit.jupiter.api.Test;
import week_16.java.AgeRestrictionValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgeRestrictionValidator {
    @Test
    void TestJustBelowMinimum() {
        AgeRestrictionValidator testCase1 = new AgeRestrictionValidator();
        assertFalse(testCase1.isEligible(17), "IsEligible method is not checking just below  minimum bound correctly");
    }

    @Test
    void TestAgeAtMinimumBoundary() {
        AgeRestrictionValidator testCase2 = new AgeRestrictionValidator();
        assertTrue(testCase2.isEligible(18), "IsEligible method is not checking correctly minimum value");
    }

    @Test
    void TestJustAboveMaximum() {
        AgeRestrictionValidator testCase3 = new AgeRestrictionValidator();
        assertTrue(testCase3.isEligible(19), "IsEligible method is not checking correctly minimum value of just above");
    }

    @Test
    void TestJustBelowMaximum() {
        AgeRestrictionValidator testCase4 = new AgeRestrictionValidator();
        assertTrue(testCase4.isEligible(64), "IsEligible method is not checking just below maximum bound correctly");
    }

    @Test
    void TestAgeAtMaximumBoundary() {
        AgeRestrictionValidator testCase5 = new AgeRestrictionValidator();
        assertTrue(testCase5.isEligible(65), "IsEligible method is not checking maximum boundary correctly");
    }

    @Test
    void TestAgeJustAboveMaximum() {
        AgeRestrictionValidator testCase6 = new AgeRestrictionValidator();
        assertFalse(testCase6.isEligible(66), "IsEligible method is not checking just above boundary correctly");
    }

    @Test
    void TestExtremeLowAge() {
        AgeRestrictionValidator testCase7 = new AgeRestrictionValidator();
        assertFalse(testCase7.isEligible(0), "IsEligible method is not checking extreme low age correctly");
    }

    @Test
    void TestExtremeHighAge() {
        AgeRestrictionValidator testCase8 = new AgeRestrictionValidator();
        assertFalse(testCase8.isEligible(100), "IsEligible method is not checking extreme high age correctly");
    }
}
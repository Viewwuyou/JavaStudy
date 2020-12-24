package com.viewwuyou.java.junit.test;

import com.viewwuyou.java.junit.tested.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(3, calculator.add(1, 2), 0.1);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculator.divide(1, 0), 0.001);
    }
}

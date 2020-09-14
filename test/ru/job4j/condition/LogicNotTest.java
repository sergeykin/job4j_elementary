package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicNotTest {
    LogicNot logicNot = new LogicNot();

    @Test
    public void isEven() {
        Assert.assertEquals(true, logicNot.isEven(4));
    }

    @Test
    public void isPositive() {
        Assert.assertEquals(true, logicNot.isPositive(4));
    }

    @Test
    public void notEven() {
        Assert.assertEquals(true, logicNot.notEven(3));
    }

    @Test
    public void notPositive() {
        Assert.assertEquals(true, logicNot.notPositive(-4));
    }

    @Test
    public void notEvenAndPositive() {
        Assert.assertEquals(true, logicNot.notEvenAndPositive(3));
    }

    @Test
    public void evenOrNotPositive() {
        Assert.assertEquals(true, logicNot.evenOrNotPositive(-4));
    }
}
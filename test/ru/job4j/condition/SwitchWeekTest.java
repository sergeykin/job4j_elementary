package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {
    SwitchWeek switchWeek = new SwitchWeek();

    @Test
    public void nameOfDay() {
        Assert.assertEquals("Среда", switchWeek.nameOfDay(3));
    }
}
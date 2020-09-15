package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {
    MultipleSwitchWeek multipleSwitchWeek = new MultipleSwitchWeek();

    @Test
    public void numberOfDayMondayRus() {
        Assert.assertEquals(3, multipleSwitchWeek.numberOfDay("Среда"));
    }

    @Test
    public void numberOfDayMondayEng() {
        Assert.assertEquals(3, multipleSwitchWeek.numberOfDay("Wednesday"));
    }

}
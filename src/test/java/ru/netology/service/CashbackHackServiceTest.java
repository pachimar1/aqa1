package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainWithPositiveValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testForDownBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testForUpBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
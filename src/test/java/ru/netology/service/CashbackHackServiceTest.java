package ru.netology.service;

import org.junit.Assert;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainWithPositiveValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testForDownBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testForUpBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void jupiterTestRemainWithPositiveValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void jupiterTestForDownBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void jupiterTestForUpBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
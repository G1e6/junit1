package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test

    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void remain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);
    }


}

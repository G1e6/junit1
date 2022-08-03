package ru.netology.service;





import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(actual,expected);



    };


    @Test
    void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual,expected);
    };


}
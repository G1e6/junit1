package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1000;

            int actual = cashbackHackService.remain(amount);
            int expected = 1000;

         Assertions.assertEquals(expected, actual) ;
        };

    @Test
    void remain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        Assertions.assertEquals(expected, actual);
    };

    @Test
    void remain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        Assertions.assertEquals(expected, actual);
    };

}
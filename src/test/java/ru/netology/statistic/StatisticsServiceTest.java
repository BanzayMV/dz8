package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void FindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.FindMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void FindMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -12, 0};
        long expected = 0;

        long actual = service.FindMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void FindMaxMid() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 5, 8, 4, 5, 25, 8, 6, 11, 11, 1};
        long expected = 25;

        long actual = service.FindMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
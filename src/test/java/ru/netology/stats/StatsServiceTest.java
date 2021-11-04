package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(salesByMonth);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shoulSoldMaximum() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.soldMaximum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shoulSoldMinimum() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.soldMinimum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shoulСalculateSalesBelowAvg() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateSalesBelowAvg(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shoulСalculateSalesHigherAvg() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateSalesHigherAvg(salesByMonth);

        assertEquals(expected, actual);
    }
}

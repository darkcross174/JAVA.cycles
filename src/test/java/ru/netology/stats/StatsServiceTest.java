package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private int[] purchaces = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatsService service = new StatsService();


    @Test
    void shouldSum() {

        int expected = 180;

        int actual = service.sum(purchaces);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {

        int expected = 15;

        int actual = service.average(purchaces);

        assertEquals(expected, actual);
    }

    @Test
    void shouldreturnMonthNumberWithMAX() {
        int expected = 8;
        int actual = service.MonthWithMax(purchaces);

        assertEquals(expected, actual);

    }

    @Test
    void shouldreturnMonthNumberWithMin() {
        int expected = 9;
        int actual = service.MonthWithMin(purchaces);

        assertEquals(expected, actual);

    }

    @Test
    void shouldreturnMonthCountMoreThenAverage() {
        int expected = 5;
        int actual = service.moreThenAverage(purchaces);

        assertEquals(expected, actual);

    }

    @Test
    void shouldreturnMonthCountLessThenAverage() {
        int expected = 5;
        int actual = service.moreLessAverage(purchaces);

        assertEquals(expected, actual);

    }


}
package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpotBugsTest {
    @Test
    void findMax() {
        SpotBugs service = new SpotBugs();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax100() {
        SpotBugs service = new SpotBugs();

        long[] incomesInBillions = {0, 1, 5};  //условие сработает на 0
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void secondlargest() {
        SecondLargest largest = new SecondLargest();
        int[] numbers = {1,2,3,4,5,6,9,12};
        int expected = 9;
        assertEquals(expected, largest.secondlargest(numbers));
    }
}
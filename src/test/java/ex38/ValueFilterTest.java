package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    @Test
    void convertToNumArray() {
        String[] stringArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        ArrayList testNumberArray = new ArrayList();
        testNumberArray.add(1);
        testNumberArray.add(2);
        testNumberArray.add(3);
        testNumberArray.add(4);
        testNumberArray.add(5);
        testNumberArray.add(6);
        testNumberArray.add(7);
        testNumberArray.add(8);
        testNumberArray.add(9);
        testNumberArray.add(0);
        ArrayList numberArray = new ArrayList();
        for(int i = 0; i < stringArray.length; i++) {
            numberArray.add(Integer.parseInt(stringArray[i]));
        }
        assertEquals(numberArray,testNumberArray);
    }

    @Test
    void filterEvenNumbers() {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(0);
        ArrayList testNumberArray = new ArrayList();
        testNumberArray.add(2);
        testNumberArray.add(4);
        testNumberArray.add(6);
        testNumberArray.add(8);
        testNumberArray.add(0);
        ArrayList numberArray = new ArrayList();
        for(int i = 0; i < numbers.size(); i++) {
            if((int) numbers.get(i) % 2 == 0)
                numberArray.add(numbers.get(i));
        }
        assertEquals(numberArray, testNumberArray);
    }
}
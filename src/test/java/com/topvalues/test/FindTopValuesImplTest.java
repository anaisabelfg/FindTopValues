package com.topvalues.test;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class FindTopValuesImplTest {

    @Test
    public void findMaxValue() throws Exception {

        int[] anyOldOrderValues = null;
        assertTrue(findTopValues.findMaxValue(anyOldOrderValues) == -1);

        anyOldOrderValues = new int[]{};
        assertTrue(findTopValues.findMaxValue(anyOldOrderValues) == -1);

        anyOldOrderValues = new int[]{365, 24, 89, 100, 13, -5, 87, 74, 564, 21, 10};
        assertTrue(findTopValues.findMaxValue(anyOldOrderValues) == 564);

    }

    @Test
    public void findTopNValues() throws Exception {

        int[] anyOldOrderValues = null;
        int n = 0;
        assertArrayEquals(new int[]{}, findTopValues.findTopNValues(anyOldOrderValues, n));

        anyOldOrderValues = new int[]{};
        assertArrayEquals(new int[]{}, findTopValues.findTopNValues(anyOldOrderValues, n));

        anyOldOrderValues = new int[]{365, 24, 89, 100, 13, -5, 87, 74, 564, 21, 10};
        n = -1;
        assertArrayEquals(new int[]{}, findTopValues.findTopNValues(anyOldOrderValues, n));

        anyOldOrderValues = new int[]{365, 24, 89, 100, 13, -5, 87, 74, 564, 21, 10};
        n = 0;
        assertArrayEquals(new int[]{}, findTopValues.findTopNValues(anyOldOrderValues, n));

        anyOldOrderValues = new int[]{365, 24, 89, 100, 13, -5, 87, 74, 564, 21, 10};
        n = 12;
        assertArrayEquals(new int[]{}, findTopValues.findTopNValues(anyOldOrderValues, n));

        anyOldOrderValues = new int[]{365, 24, 89, 100, 13, -5, 87, 74, 564, 21, 10};
        n = 3;
        int[] expectedValues = new int[]{564, 365, 100};
        assertArrayEquals(expectedValues, findTopValues.findTopNValues(anyOldOrderValues, n));

    }

    private FindTopValues findTopValues = new FindTopValuesImpl();

}

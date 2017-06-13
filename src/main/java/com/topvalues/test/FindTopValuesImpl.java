package com.topvalues.test;

import java.util.Arrays;

public class FindTopValuesImpl implements FindTopValues {
    public int findMaxValue(int[] anyOldOrderValues) {

        if (null == anyOldOrderValues || anyOldOrderValues.length == 0) return -1;

        int maxValue = -1;
        for (int value : anyOldOrderValues) {
            if (value > maxValue) maxValue = value;
        }
        return maxValue;

    }

    public int[] findTopNValues(int[] anyOldOrderValues, int n) {

        if (null == anyOldOrderValues || anyOldOrderValues.length == 0 || n < 1 || n > anyOldOrderValues.length)
            return new int[]{};

        int[] topNValues = Arrays.stream(anyOldOrderValues)
                .sorted()
                .skip(anyOldOrderValues.length - n)
                .toArray();


        return reverseArray(topNValues);
    }

    private int[] reverseArray(int[] ascOrder) {
        int[] descOrder = new int[ascOrder.length];

        int j = 0;

        for (int i = ascOrder.length - 1; i >= 0; i--) {

            descOrder[j] = ascOrder[i];
            j++;
        }

        return descOrder;
    }


}

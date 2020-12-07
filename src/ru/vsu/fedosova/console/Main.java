package ru.vsu.fedosova.console;

import ru.vsu.fedosova.ArrayUtils;
import ru.vsu.fedosova.common.GetQuantityIntervals;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = ArrayUtils.readIntArrayFromConsole();

        GetQuantityIntervals GetQuantityIntervals = new GetQuantityIntervals();

        int[] arrIntervals = GetQuantityIntervals.getQuantityIntervals(arr);

        printResults("decreasing", arrIntervals[0]);
        printResults("increasing", arrIntervals[1]);
    }

    public static void printResults(String name, int result)
    {
        System.out.printf("Quantity of %s intervals in the array: %d\n", name, result);
    }
}

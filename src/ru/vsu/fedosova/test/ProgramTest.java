package ru.vsu.fedosova.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import ru.vsu.fedosova.Program;

public class ProgramTest extends RunListener
{

    @Test
    public void testGetQuantityIntervals1()
    {
        Program main = new Program();
        int[] expectedArray1 = main.getQuantityIntervals(new int[]{1, 3, -2, 11, 7, 3, 3, 2, 4, 2, 7, 12});
        int[] actualArrIntervals1 = {4, 4};
        Assert.assertArrayEquals(actualArrIntervals1, expectedArray1);
    }

    @Test
    public void testGetQuantityIntervals2()
    {
        Program main = new Program();
        int[] expectedArray2 = main.getQuantityIntervals(new int[]{1, 1, 1, 1, 1, 1, 1});
        int[] actualArrIntervals2 = {0, 0};
        Assert.assertArrayEquals(actualArrIntervals2, expectedArray2);
    }

    @Test
    public void testGetQuantityIntervals3()
    {
        Program main = new Program();
        int[] expectedArray3 = main.getQuantityIntervals(new int[]{3, 2, 1, 1, 2, 3});
        int[] actualArrIntervals3 = {1, 1};
        Assert.assertArrayEquals(actualArrIntervals3, expectedArray3);
    }

    @Test
    public void testGetQuantityIntervals4()
    {
        Program main = new Program();
        int[] expectedArray4 = main.getQuantityIntervals(new int[]{-12, 25, 25, 25, 1000, 15, 87, 45});
        int[] actualArrIntervals4 = {2, 3};
        Assert.assertArrayEquals(actualArrIntervals4, expectedArray4);
    }

    @Test
    public void testGetQuantityIntervals5()
    {
        Program main = new Program();
        int[] expectedArray5 = main.getQuantityIntervals(new int[]{10, 11, 12, 9, 1, 2, 5, 7, 8, 10, 11, 12, 3, 4, 1, 2, 5, 6, 1, 2, 5, 34});
        int[] actualArrIntervals5 = {4, 5};
        Assert.assertArrayEquals(actualArrIntervals5, expectedArray5);
    }

    @Test
    public void testGetQuantityIntervals6()
    {
        Program main = new Program();
        int[] expectedArray6 = main.getQuantityIntervals(new int[]{1, 1, 1, 1, 1, 1, 2, 1});
        int[] actualArrIntervals6 = {1, 1};
        Assert.assertArrayEquals(actualArrIntervals6, expectedArray6);
    }

    @Test
    public void testGetQuantityIntervals7()
    {
        Program main = new Program();
        int[] expectedArray7 = main.getQuantityIntervals(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2});
        int[] actualArrIntervals7 = {5, 6};
        Assert.assertArrayEquals(actualArrIntervals7, expectedArray7);
    }

    @Test
    public void testGetQuantityIntervals8()
    {
        Program main = new Program();
        int[] expectedArray8 = main.getQuantityIntervals(new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int[] actualArrIntervals8 = {0, 1};
        Assert.assertArrayEquals(actualArrIntervals8, expectedArray8);
    }

    @Test
    public void testGetQuantityIntervals9()
    {
        Program main = new Program();
        int[] expectedArray9 = main.getQuantityIntervals(new int[]{-1, -2, -3, -4, -5, -6, -7});
        int[] actualArrIntervals9 = {1, 0};
        Assert.assertArrayEquals(actualArrIntervals9, expectedArray9);
    }

    @Test
    public void testGetQuantityIntervals10()
    {
        Program main = new Program();
        int[] expectedArray10 = main.getQuantityIntervals(new int[]{1000000, 10000000, -1000000});
        int[] actualArrIntervals10 = {1, 1};
        Assert.assertArrayEquals(actualArrIntervals10, expectedArray10);
    }
}
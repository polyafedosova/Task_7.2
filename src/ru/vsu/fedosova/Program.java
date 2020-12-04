package ru.vsu.fedosova;

public class Program
{
    public static void main(String[] args)
    {
        int[] arr = ArrayUtils.readIntArrayFromConsole();

        int[] arrIntervals = getQuantityIntervals(arr);

        printResults("decreasing", arrIntervals[0]);
        printResults("increasing", arrIntervals[1]);
    }

    public static int[] getQuantityIntervals(int[] arr)
    {
        int quantityDecrease = 0;
        int quantityIncrease = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                quantityDecrease++;
                for (int j = i + 1; j < arr.length - 1; j++)
                {
                    if (arr[j] > arr[j + 1]) i++;
                    else break;
                }
            }
            else if (arr[i] < arr[i + 1])
            {
                quantityIncrease++;
                for (int j = i + 1; j < arr.length - 1; j++)
                {
                    if (arr[j] < arr[j + 1]) i++;
                    else break;
                }
            }
        }

        int[] arrayIntervals = new int[] {quantityDecrease, quantityIncrease};
        return arrayIntervals;
    }

    public static void printResults(String name, int result)
    {
        System.out.printf("Quantity of %s intervals in the array: %d\n", name, result);
    }
}

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c)
    {
        int[] result = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++) {
            result[r] = arr2D[r][c];
        }
        return result;
    }
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            boolean match = false;
            int value = arr1[i];
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr2[j] == value) {
                    match = true;
                }
            }
            if (!match) {
                return false;
            }
        }
        return true;
    }
    public static boolean containsDuplicates(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
    public static boolean isLatin(int[][] square)
    {
        int[] firstRow = square[0];
        if (containsDuplicates(firstRow)) {
            return false;
        }
        for (int r = 0; r < square.length; r++)
        {
            if (!hasAllValues(firstRow, square[r]))
                return false;
        }
        for (int c = 0; c < square.length; c++)
        {
            int[] col = getColumn(square, c);
            if (!hasAllValues(firstRow,col))
            {
                return false;
            }
        }
        return true;
    }
}

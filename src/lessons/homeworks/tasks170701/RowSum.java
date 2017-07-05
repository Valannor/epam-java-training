package lessons.homeworks.tasks170701;

public class RowSum
{
    public static void main(String[] args)
    {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {-1, 100, 100, 100, 101},
                {10, 12, 13, 14, 15},
                {0, 9, 8, 7, 6},
                {23, 42, 65, 97, 11}
        };

        getRowSum(array);
    }

    private static void getRowSum(int[][] array)
    {
        NEXT_ROW:
        for (int i = 0; i < array.length; i++)
        {
            int[] row = array[i];
            int rowSum = 0;

            for (int cell : row)
            {
                if (cell < 0)
                {
                    continue NEXT_ROW;
                } else
                {
                    rowSum += cell;
                }
            }

            System.out.format("Row #%d - sum:%d\r\n", i, rowSum);
        }
    }
}

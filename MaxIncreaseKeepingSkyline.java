package LeetCode;

/**
 * Created by jackli on 2018-10-02.
 * <p>
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
 */
public class MaxIncreaseKeepingSkyline
{
    public static int maxIncreaseKeepingSkyline(int[][] grid)
    {
        if (grid.length == 0 || grid[0].length == 0)
        {
            return 0;
        }

        // Get max in each row, store in array
        int[] rowMaxHeights = new int[grid.length];

        // Get max in each column, store in array
        int[] columnMaxHeights = new int[grid[0].length];

        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++)
        {
            for (int columnIndex = 0; columnIndex < grid[rowIndex].length; columnIndex++)
            {
                rowMaxHeights[rowIndex] = Math.max(grid[rowIndex][columnIndex],
                        rowMaxHeights[rowIndex]);
                columnMaxHeights[columnIndex] = Math.max(grid[rowIndex][columnIndex],
                        columnMaxHeights[columnIndex]);
            }
        }

        int totalHeightIncrease = 0;
        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++)
        {
            for (int columnIndex = 0; columnIndex < grid[rowIndex].length; columnIndex++)
            {
                int currentHeight = grid[rowIndex][columnIndex];
                totalHeightIncrease += Math.min(rowMaxHeights[rowIndex],
                        columnMaxHeights[columnIndex]) - currentHeight;
            }
        }

        return totalHeightIncrease;
    }

    public static void main(String[] args)
    {
        System.out.println(maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        }));

        System.out.println(maxIncreaseKeepingSkyline(new int[][]{
                {1, 1},
                {1, 1}
        }));

        System.out.println(maxIncreaseKeepingSkyline(new int[][]{
                {0}
        }));

        System.out.println(maxIncreaseKeepingSkyline(new int[][]{
                {}
        }));

        System.out.println(maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8},
                {2, 4, 8},
                {9, 2, 8},
                {0, 3, 8}
        }));
    }
}

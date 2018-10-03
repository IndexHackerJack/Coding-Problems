package LeetCode;

import java.util.Arrays;

/**
 * Created by jackli on 2018-10-02.
 * 
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortByParity
{
    public static int[] sortArrayByParity(int[] A)
    {
        int[] paritySorted = new int[A.length];
        int evenIndex = 0;
        int oddIndex = paritySorted.length - 1;

        for (int num : A)
        {
            if (num % 2 == 0)
            {
                paritySorted[evenIndex] = num;
                evenIndex++;
            }
            else
            {
                paritySorted[oddIndex] = num;
                oddIndex--;
            }
        }

        return paritySorted;
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(sortArrayByParity(
                new int[]{9, 3, 1, 4, 6, 8, 1029, 9001})));

        System.out.println(Arrays.toString(sortArrayByParity(
                new int[]{4, 9, 7, 3, 190})));

        System.out.println(Arrays.toString(sortArrayByParity(
                new int[]{})));
        
        System.out.println(Arrays.toString(sortArrayByParity(
                new int[]{8, 8, 8, 8, 8, 8, 8, 8})));
    }
}

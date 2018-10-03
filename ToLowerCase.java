package LeetCode;

/**
 * Created by jackli on 2018-10-02.
 * 
 * https://leetcode.com/problems/to-lower-case/description/
 */
public class ToLowerCase
{
    public static String toLowerCase(String str)
    {
        char[] letters = str.toCharArray();

        for (int i = 0; i < letters.length; i++)
        {
            char current = letters[i];

            if (current >= 'A' && current <= 'Z')
            {
                letters[i] = (char) (letters[i] - 'A' + 'a');
            }
        }

        return new String(letters);
    }

    public static void main(String[] args)
    {
        System.out.println(toLowerCase("YoYoyoyYoooYooo"));
        System.out.println(toLowerCase(""));
        System.out.println(toLowerCase("AHHHHAHAHAHA"));
        System.out.println(toLowerCase("hiiihihi"));
    }
}

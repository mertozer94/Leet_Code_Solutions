/**
 * @author Mert Ozer
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.
Example 1:

Input:
26

Output:
"1a"
Example 2:

Input:
-1

Output:
"ffffffff"
 */
public class Convert_a_Number_to_Hexadecimal_405 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,16,10000};
        for(int num:nums)
            System.out.println(toHex(num));
    }
    /*
    * Basic idea: each time we take a look at the last four digits of
            binary verion of the input, and maps that to a hex char
            shift the input to the right by 4 bits, do it again
            until input becomes 0.
        https://leetcode.com/problems/convert-a-number-to-hexadecimal/discuss/89253/Simple-Java-solution-with-comment
     */
    public static String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}

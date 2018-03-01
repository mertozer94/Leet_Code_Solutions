/**
 * @author Mert Ozer
 */
public class Base7_504 {
    public static void main(String [] args)
    {
        Base7_504 solution = new Base7_504();
        System.out.println(solution.convertToBase7(86));
    }
    public String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();

        int r = num, signed = 0;
        int b = 7;
        if (num < 0){
            num *= -1;
            signed = 1;
        }
        while (num >= b){
            r = num % b;
            s.append(r);
            num /= b;
        }
        s.append(num);

        if (signed == 1){
            s.append('-');
        }
        return s.reverse().toString();
    }
}

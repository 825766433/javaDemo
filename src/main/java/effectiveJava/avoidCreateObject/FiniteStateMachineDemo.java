package effectiveJava.avoidCreateObject;

import java.util.regex.Pattern;

/**
 * @ClassName FiniteStateMachineDemo 有限状态机
 * @Author licongcong
 * @Date 2021/3/12 15:40
 * @Version 1.0
 **/
public class FiniteStateMachineDemo {

    public static void main(String[] args) {


    }

    /**
     * public boolean matches(String regex) {
     *         return Pattern.matches(regex, this);
 *     }
     *
     * public static boolean matches(String regex, CharSequence input) {
     *         Pattern p = Pattern.compile(regex);
     *         Matcher m = p.matcher(input);
     *         return m.matches();
     * }
     */
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String str){
        return ROMAN.matcher(str).matches();
    }

}

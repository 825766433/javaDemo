package effectiveJava.dependencyInjection.bookDemo;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/12 14:24
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker(new XinhuaLexicon());
        System.out.println(spellChecker.isValid(""));

        SpellChecker spellChecker1 = new SpellChecker(new XinhuaLexicon(),new UserWork());
        spellChecker1.whoUse();

    }

}

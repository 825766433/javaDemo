package effectiveJava.privateConstructorIntensify;

/**
 * @Description 私有构造器，它就不能被实例化
 * @Author lcc
 * @UpdateDate 2021/3/12 9:11
 * @Param
 * @Return
 */
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }

    // Remainder omitted
}

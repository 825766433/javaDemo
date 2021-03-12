package effectiveJava.staticMethodReplaceConstructor.ownName;

/**
 * @ClassName Book1
 * @Author licongcong
 * @Date 2021/3/8 14:33
 * @Version 1.0
 **/
public class Book1 {

    private String name;
    private String version;

    /** 一个类只能有一个带有指定签名的构造器,用户永远也记不住该用哪个构造器，结果常常会调用错误的构造器 */
    public Book1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

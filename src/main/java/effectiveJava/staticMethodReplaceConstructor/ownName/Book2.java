package effectiveJava.staticMethodReplaceConstructor.ownName;

/**
 * @ClassName Book2   一个类需多个带有相同签名的构造器时，
 *                      就用静态工厂方法代替构造器，
 *                      并且仔细地选择名称以便突出静态工厂方法之间的区别。
 * @Author licongcong
 * @Date 2021/3/8 16:32
 * @Version 1.0
 **/
public class Book2 {

    private String name;
    private String version;

    public static Book2 getInstanceByName(String name){
        Book2 book2 = new Book2();
        book2.name = name;
        return book2;
    }

    public static Book2 getInstanceByVersion(String version){
        Book2 book2 = new Book2();
        book2.version = version;
        return book2;
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
        return "Book2{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

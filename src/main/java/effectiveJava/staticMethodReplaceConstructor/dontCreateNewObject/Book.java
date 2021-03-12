package effectiveJava.staticMethodReplaceConstructor.dontCreateNewObject;

/**
 * @ClassName Book  静态工厂方法能够为重复的调用返回相同对象，
 *                  这样有助于类总能严格控制在某个时刻哪些实例应该存在
 *
 *                  如果程序经常请求创建相同的对象，
 *                  并且创建对象的代价很高，
 *                  则这项技术可以极大地提升性能。
 * @Author licongcong
 * @Date 2021/3/9 10:05
 * @Version 1.0
 **/
public class Book {

    private String name;
    private String version;

    private Book(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public static Book book = new Book("defaultName","defaultVersion");

    public static Book getInstanceBook(){
        return book;
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
}

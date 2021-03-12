package effectiveJava.staticMethodReplaceConstructor.returnSubtypeObject;

/**
 * @ClassName Wood   静态工厂方法与构造器不同的第三大优势在于，它们可以返回原返回类型的任何子类型的对象
 * @Author licongcong
 * @Date 2021/3/9 14:12
 * @Version 1.0
 **/
public class Wood {

    private String age;
    private String size;

    public static Wood getStool(){
        return new Stool();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

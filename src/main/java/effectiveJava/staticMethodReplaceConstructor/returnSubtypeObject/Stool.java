package effectiveJava.staticMethodReplaceConstructor.returnSubtypeObject;

/**
 * @ClassName Stool   静态工厂方法与构造器不同的第三大优势在于，它们可以返回原返回类型的任何子类型的对象
 * @Author licongcong
 * @Date 2021/3/9 14:12
 * @Version 1.0
 **/
public class Stool extends Wood {

    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

package effectiveJava.cautiousUseClone.copyContructor;

/**
 * @ClassName Demo
 * @Author licongcong
 * @Date 2021/3/29 10:19
 * @Version 1.0
 **/
public class Demo {

    private String name;
    private String id;

    public Demo(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Demo() {
    }

    //拷贝构造器
    public Demo(Demo demo) {
        this.name=demo.name;
        this.id=demo.id;
    }

    //拷贝工厂
    public static Demo newInstance(Demo demo){
        return new Demo(demo.name,demo.id);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

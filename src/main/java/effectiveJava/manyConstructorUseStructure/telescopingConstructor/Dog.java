package effectiveJava.manyConstructorUseStructure.telescopingConstructor;

/**
 * @ClassName Dog  重叠构造器模式
 *                  简而言之，重叠构造器模式可行，但是当有许多参数的时候，客户端代码会很难缩写，且仍然较难以阅读。
 * @Author licongcong
 * @Date 2021/3/9 16:58
 * @Version 1.0
 **/
public class Dog {

    //必输
    private String name;
    //必输
    private String age;
    //选输
    private String sex;
    //选输
    private String eat;

    public Dog(String name, String age) {
        this(name,age,"");
    }

    public Dog(String name, String age, String sex) {
        this(name,age,sex,"");
    }

    public Dog(String name, String age, String sex, String eat) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}

package effectiveJava.manyConstructorUseStructure.javaBeansConstructor;

/**
 * @ClassName Cat
 * @Author licongcong
 * @Date 2021/3/9 17:13
 * @Version 1.0
 **/
public class Cat {

    //必输
    private String name;
    //必输
    private String age;
    //选输
    private String sex;
    //选输
    private String eat;

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

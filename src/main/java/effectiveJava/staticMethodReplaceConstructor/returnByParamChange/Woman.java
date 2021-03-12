package effectiveJava.staticMethodReplaceConstructor.returnByParamChange;

/**
 * @ClassName Woman   返回的对象的类可以随着每次调用而发生变化，这取决于静态工厂方法的参数值
 * @Author licongcong
 * @Date 2021/3/9 14:29
 * @Version 1.0
 **/
public class Woman {

    private String high;
    private String weight;

    public static Woman getWoman(Boolean type){
        if(type){
            return new ChinaWoman();
        }else {
            return new JapanWoman();
        }

    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

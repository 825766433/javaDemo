package effectiveJava.cautiousUseClone;

import java.util.Arrays;

/**
 * @ClassName Stack
 * @Author licongcong
 * @Date 2021/3/29 8:54
 * @Version 1.0
 **/
public class Stack implements Cloneable {

    String[] arr;

    public String[] getArr() {
        return arr;
    }

    public Stack setArr(String[] arr) {
        this.arr = arr;
        return this;
    }

    //此种克隆方法,对于可变引用,会出现问题
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //这种克隆没问题,改了引用后对象不变,对于类中项进行一个克隆
//    @Override
//    protected Stack clone() throws CloneNotSupportedException {
//        Stack clone = (Stack) super.clone();
//        clone.arr = arr.clone();
//        return clone;
//    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

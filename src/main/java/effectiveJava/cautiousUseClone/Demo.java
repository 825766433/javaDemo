package effectiveJava.cautiousUseClone;

import java.util.Objects;

/**
 * @ClassName Demo
 * @Author licongcong
 * @Date 2021/3/26 16:10
 * @Version 1.0
 **/
public class Demo implements Cloneable {

    private String id;
    private String momo;

    @Override
    protected Object clone()  {
        return new Demo();
    }

    public String getId() {
        return id;
    }

    public Demo setId(String id) {
        this.id = id;
        return this;
    }

    public String getMomo() {
        return momo;
    }

    public Demo setMomo(String momo) {
        this.momo = momo;
        return this;
    }
}

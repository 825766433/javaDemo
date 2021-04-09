package cc.demo.unsafePublish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName UnSafePublish
 * @Author licongcong
 * @Date 2021/4/8 14:54
 * @Version 1.0
 **/
public class UnSafePublish {

    public final static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    private List<Integer> list = Collections.synchronizedList( new ArrayList<Integer>());

    public List<Integer> getList() {
        return list;
    }

    public UnSafePublish() {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}

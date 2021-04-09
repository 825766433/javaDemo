package cc.demo.unsafePublish;

import java.util.List;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/4/8 14:55
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        UnSafePublish safePublish = new UnSafePublish();
        List<Integer> list = safePublish.getList();
        System.out.println(list);
        System.out.println(list.hashCode());
        System.out.println("-------------");
        list.add(4);
        System.out.println(list);
        System.out.println(list.hashCode());
        System.out.println("-------------");
        System.out.println(safePublish.getList());
        System.out.println(safePublish.getList().hashCode());



    }

}

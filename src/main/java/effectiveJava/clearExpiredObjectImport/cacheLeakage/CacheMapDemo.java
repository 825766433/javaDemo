package effectiveJava.clearExpiredObjectImport.cacheLeakage;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @ClassName CacheDemo  使用WeakHashMap代表缓存，此种Map的特点是，当除了自身有对key的引用外，此key没有其他引用那么此map会自动丢弃此值
 *                       只有当所要的缓存项的生命周期是由该键的外部引用而不是由值决定时，WeakHashMap才有用处
 * @Author licongcong
 * @Date 2021/3/17 11:25
 * @Version 1.0
 **/
public class CacheMapDemo {

    static Map wMap = new WeakHashMap();
    static Map map = new HashMap();

    public static void init() {

        wMap.put(new Integer("1"), "2");
        wMap.put(new Integer("2"), "4");
        map.put(new Integer("5"), "6");
        map.put(new Integer("7"), "8");
        System.out.println("key 引用 消失");

    }

    public static void testWeakHashMap() throws InterruptedException {

        System.out.println("WeakHashMap GC之前");

        for (Object o : wMap.entrySet()) {
            System.out.println(o);
        }

        System.gc();
        Thread.sleep(3000L);

        System.out.println("WeakHashMap GC之后");

        for (Object o : wMap.entrySet()) {
            System.out.println(o);
        }
    }

    public static void testHashMap() throws InterruptedException {
        System.out.println("HashMap GC之前");

        for (Object o : map.entrySet()) {
            System.out.println(o);
        }

        System.gc();
        Thread.sleep(3000L);

        System.out.println("HashMap GC之后");

        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        init();
        testWeakHashMap();
        testHashMap();
    }

}

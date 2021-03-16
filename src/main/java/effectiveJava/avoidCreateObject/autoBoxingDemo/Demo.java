package effectiveJava.avoidCreateObject.autoBoxingDemo;

/**
 * @ClassName Demo  变量sum被声明成Long而不是long，意味着程序构造了大约2的31次方个多余的Long实例（大约每次往Longsum中增加long时构造一个实例）。
 *                  自动拆箱装箱需要耗费资源,也就需要时间并且慢
 * @Author licongcong
 * @Date 2021/3/16 9:58
 * @Version 1.0
 **/
public class Demo {
/** Integer i=10 ;   //自动装箱

    int i = new Integer(10); //自动拆箱*/

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        sum();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-begin);
        long begin2 = System.currentTimeMillis();
        sum2();
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-begin2);
    }

    private static long sum(){
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;

        }
        return sum;
    }

    private static long sum2(){
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;

        }
        return sum;
    }

    private static long sumInt(){
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
//            System.out.println(sum);
        }
        return sum;
    }

}

package effectiveJava.avoidUseFinalizerAndClear;

import java.lang.ref.WeakReference;

/**
 * @ClassName Demo  java9中使用cleaner()代替了finalize(),但是由于清除方法的执行时间也是不确定的、也不保证会被执行，所以同样不推荐使用。
 *
 *                  终结方法和清除方法的缺点在于不能保证会被及时执行［JLS12.6］ 。从一个对象变得不可到达开始，到它的终结方法被执行，所花费的这段时间是任意长的
 *                  Java语言规范不仅不保证终结方法或者清除方法会被及时地执行，而且根本就不保证它们会被执行
 *
 *                  由于GC机制的存在，在Java中，我们无法预知对象会在何时被回收，也就是说我们无法预知终结方法会在何时被执行，Java语言规范也不保证终结方法会被执行。
 *                  这是十分危险的
 * @Author licongcong
 * @Date 2021/3/17 18:24
 * @Version 1.0
 **/
public class Demo {

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Demo finalize()");
    }

    public static void main(String[] args) {
        //弱引用
        WeakReference<A> weakReference = new WeakReference<>(new A());
        Demo demo = new Demo();
        System.gc();
    }

}


class A {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("A finalize()");
    }
}
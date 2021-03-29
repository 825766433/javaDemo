package effectiveJava.cautiousUseClone;

/**
 * @ClassName StackRun
 * @Author licongcong
 * @Date 2021/3/29 9:03
 * @Version 1.0
 **/
public class StackRun {

    public static void main(String[] args) throws CloneNotSupportedException {

        Stack stack = new Stack();
        String[] arr = new String[]{"111","222"};
        stack.setArr(arr);
        Stack clone = (Stack) stack.clone();
        System.out.println(stack);
        System.out.println(clone);
        arr[0]="555";
        System.out.println(stack);
        //此时出现一种现象,修改了原始的实例会破坏被克隆对象中的内容.
        System.out.println(clone);

    }

}

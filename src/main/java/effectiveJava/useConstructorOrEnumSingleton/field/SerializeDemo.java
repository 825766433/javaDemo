package effectiveJava.useConstructorOrEnumSingleton.field;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName SerializeDemo  提供readResolve方法是为了每次反序列化一个序列化的实例时，避免去创建一个新的实例
 *                          参考帖子(单例、序列化和readResolve()方法):https://zhuanlan.zhihu.com/p/136769959
 * @Author licongcong
 * @Date 2021/3/10 16:07
 * @Version 1.0
 **/
public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
            File file = new File("singleton");
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            Elvis SingletonB1 = Elvis.elvis;

            oos.writeObject(SingletonB1);
            oos.close();
            ois = new ObjectInputStream(new FileInputStream(file));
            Elvis SingletonB2 = (Elvis) ois.readObject();
            System.out.println(SingletonB1 == SingletonB2);
            System.out.println(SingletonB1);
            System.out.println(SingletonB2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package effectiveJava.tryWithResources.tryWithResources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName Demo
 * @Author licongcong
 * @Date 2021/3/18 14:47
 * @Version 1.0
 **/
public class Demo {

    public static void main(String[] args) throws IOException {
        System.out.println(copy2("aaa","vvv"));
    }

    static String firstLineOfFile(String path) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }

    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream is = new FileInputStream(src); OutputStream os = new FileOutputStream(dst)) {
            byte[] buf = new byte[8 * 1024];
            int n;
            while ((n = is.read(buf)) > 0) {
                os.write(buf, 0, n);
            }
        }
    }

    static String copy2(String src, String dst) {
            try (InputStream is = new FileInputStream(src); OutputStream os = new FileOutputStream(dst)) {
                byte[] buf = new byte[8 * 1024];
                int n;
                while ((n = is.read(buf)) > 0) {
                    os.write(buf, 0, n);
                }
                return dst;
            }catch (IOException e) {
                return "123123123123123";
            }
    }

}

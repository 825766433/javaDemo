package effectiveJava.tryWithResources.tryFinally;

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
 * @Date 2021/3/18 14:39
 * @Version 1.0
 **/
public class Demo {

    private static final int BUFFER_SIZE = 8 * 1024;

    public static void main(String[] args) throws IOException {
        String path = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }

    }

    void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}

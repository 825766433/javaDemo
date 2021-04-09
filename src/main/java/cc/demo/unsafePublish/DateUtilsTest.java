package cc.demo.unsafePublish;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName DateUtilsTest
 * @Author licongcong
 * @Date 2021/4/8 17:33
 * @Version 1.0
 **/
public class DateUtilsTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new DateUtils("2019-11-25 09:00:" + i % 60));
        }
    }

}

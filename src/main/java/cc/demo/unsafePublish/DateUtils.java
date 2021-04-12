package cc.demo.unsafePublish;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Author licongcong
 * @Date 2021/4/8 17:30
 * @Version 1.0
 **/
public class DateUtils implements Runnable {

    private static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("aaa");
            return null;
        }
    };

    private String date;

    public DateUtils(String date) {
        this.date = date;
    }

    @Override
    public void run() {
        if (sdf.get() == null) {
            sdf.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            sdf.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            sdf.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        } else {
            try {
                Date date = sdf.get().parse(this.date);
                System.out.println(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }
}

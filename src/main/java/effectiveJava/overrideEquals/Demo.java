package effectiveJava.overrideEquals;

/**
 * @ClassName Demo
 * @Author licongcong
 * @Date 2021/3/18 15:23
 * @Version 1.0
 **/
public class Demo {

    private String key;
    private String value;

    public Demo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Demo2 demo = new Demo2("111","aaa");
        Demo2 demo2 = new Demo2("111","aaa");
        System.out.println(demo.equals(demo2));
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Demo)){
            return false;
        }
        Demo demo = (Demo) obj;
        return demo.key.equals(key)&&demo.value.equals(value);
    }

    private static class Demo2{
        private String key;
        private String value;

        public Demo2(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Demo2)){
                return false;
            }
            Demo2 demo = (Demo2) obj;
            return demo.key.equals(key)&&demo.value.equals(value);
        }
    }

}

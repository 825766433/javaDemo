package effectiveJava.dependencyInjection.threeMethod.setDI;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/12 14:55
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        StupidStudent stupidStudent = new StupidStudent();
        stupidStudent.setSmartStudent(new SmartStudent());
        stupidStudent.doHomeWork();


    }

}

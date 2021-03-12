package effectiveJava.dependencyInjection.threeMethod.interfaceDI;

/**
 * @ClassName StupidStudent
 * @Author licongcong
 * @Date 2021/3/12 14:54
 * @Version 1.0
 **/
public class StupidStudent {

    public void doHomeWork(SmartStudent smartStudent){
        smartStudent.doHomeWork();
        System.out.println("StupidStudent.doHomeWork()");
    }
}

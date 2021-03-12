package effectiveJava.dependencyInjection.threeMethod.setDI;

/**
 * @ClassName StupidStudent
 * @Author licongcong
 * @Date 2021/3/12 14:54
 * @Version 1.0
 **/
public class StupidStudent {

    private SmartStudent smartStudent;

    public void doHomeWork(){
        smartStudent.doHomeWork();
        System.out.println("StupidStudent.doHomeWork()");
    }

    public StupidStudent setSmartStudent(SmartStudent smartStudent) {
        this.smartStudent = smartStudent;
        return this;
    }
}

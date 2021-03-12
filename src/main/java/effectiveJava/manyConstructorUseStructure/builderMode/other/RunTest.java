package effectiveJava.manyConstructorUseStructure.builderMode.other;

import static effectiveJava.manyConstructorUseStructure.builderMode.other.MyPizza.Size.SMALL;
import static effectiveJava.manyConstructorUseStructure.builderMode.other.Pizza.Topping.HAM;
import static effectiveJava.manyConstructorUseStructure.builderMode.other.Pizza.Topping.ONION;
import static effectiveJava.manyConstructorUseStructure.builderMode.other.Pizza.Topping.SAUSAGE;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/10 10:28
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        MyPizza pizza = new MyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }

}

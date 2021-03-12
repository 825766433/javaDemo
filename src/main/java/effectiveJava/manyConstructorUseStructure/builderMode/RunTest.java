package effectiveJava.manyConstructorUseStructure.builderMode;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/10 9:33
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

    }

}

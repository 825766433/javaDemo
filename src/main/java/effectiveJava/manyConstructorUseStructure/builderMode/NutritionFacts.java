package effectiveJava.manyConstructorUseStructure.builderMode;

/**
 * @ClassName NutritionFacts  既能保证像重叠构造器模式那样的安全性，也能保证像JavaBeans模式那么好的可读性。
 *                              这就是建造者（Builder）模式［Gamma95］的一种形式。
 *                              它不直接生成想要的对象，而是让客户端利用所有必要的参数调用构造器（或者静态工厂），
 *                              得到一个builder对象。然后客户端在builder对象上调用类似于setter的方法，
 *                              来设置每个相关的可选参数
 * @Author licongcong
 * @Date 2021/3/10 9:28
 * @Version 1.0
 **/
public class NutritionFacts {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // 这里return，是为了每次设置值都返回一个Builder对象
        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

}

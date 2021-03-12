package effectiveJava.manyConstructorUseStructure.builderMode.other;

import java.util.Objects;

/**
 * @ClassName MyPizza
 * @Author licongcong
 * @Date 2021/3/10 10:23
 * @Version 1.0
 **/
public class MyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public MyPizza build() {
            return new MyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private MyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}

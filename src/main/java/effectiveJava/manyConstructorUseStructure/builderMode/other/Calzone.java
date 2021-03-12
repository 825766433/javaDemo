package effectiveJava.manyConstructorUseStructure.builderMode.other;

/**
 * @ClassName Calzone
 * @Author licongcong
 * @Date 2021/3/10 10:27
 * @Version 1.0
 **/
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // Default

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() { return this; }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

}

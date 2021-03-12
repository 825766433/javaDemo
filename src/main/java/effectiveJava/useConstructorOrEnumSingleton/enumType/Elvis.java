package effectiveJava.useConstructorOrEnumSingleton.enumType;

/**
 * @Description 包含单个元素的枚举类型
 * @Author lcc 
 * @UpdateDate 2021/3/10 17:10
 * @Param 
 * @Return 
 */
public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding()!");
    }

}

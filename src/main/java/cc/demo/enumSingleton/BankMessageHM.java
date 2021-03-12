package cc.demo.enumSingleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description 相关枚举类,使用枚举进行相关单例模式的使用
 * @Author lcc 
 * @UpdateDate 2021/3/3 10:57
 * @Param 
 * @Return 
 */
public enum BankMessageHM {
    SINGLETON;
    private ConcurrentHashMap<String,String> map;

    private BankMessageHM() {
        this.map = new ConcurrentHashMap<String,String>();
    }

    private ConcurrentHashMap<String,String> instance(){
        return map;
    }

    public static ConcurrentHashMap<String,String> getBankMessageHM(){
        return BankMessageHM.SINGLETON.instance();
    }

}

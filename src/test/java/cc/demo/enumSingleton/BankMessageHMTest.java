package cc.demo.enumSingleton;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BankMessageHM
 * @Author licongcong
 * @Date 2021/3/3 10:54
 * @Version 1.0
 **/
public class BankMessageHMTest {

    @Test
    public void setRun(){
        ConcurrentHashMap<String, String> bankMessageHM = BankMessageHM.getBankMessageHM();
        bankMessageHM.put("111","222");
    }

    @Test
    public void getRun(){
        ConcurrentHashMap<String, String> bankMessageHM = BankMessageHM.getBankMessageHM();
        bankMessageHM.put("111","222");
        String memoryBankID = bankMessageHM.get("111");
        System.out.println(memoryBankID);
    }

}

package proxy;

import java.lang.reflect.Proxy;

/**
 * @author apple on 2019/12/1.
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Fenjiu fenjiu = new Fenjiu();
        GuitaiInvocationHandler guitaiInvocationHandler = new GuitaiInvocationHandler(fenjiu);
        SellWine sellWine = (SellWine) Proxy.newProxyInstance(Fenjiu.class.getClassLoader(),
                Fenjiu.class.getInterfaces(),
                guitaiInvocationHandler);
        sellWine.sellJiu();
        System.out.println("========");
        Maotai maotai = new Maotai();
        GuitaiInvocationHandler guitaiInvocationHandler1 = new GuitaiInvocationHandler(maotai);
        SellWine sellWine1 = (SellWine) Proxy.newProxyInstance(Maotai.class.getClassLoader(),
                Maotai.class.getInterfaces(),
                guitaiInvocationHandler1);
        sellWine1.sellJiu();

    }
}

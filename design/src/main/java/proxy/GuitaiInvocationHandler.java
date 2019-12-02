package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author apple on 2019/12/1.
 * @version 1.0
 */
public class GuitaiInvocationHandler implements InvocationHandler {
    private Object pingpai;

    public GuitaiInvocationHandler(Object pingpai) {
        this.pingpai = pingpai;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("sell start:"+this.getClass().getSimpleName());
        method.invoke(pingpai, args);
        System.out.println("sell stop");
        return null;
    }
}

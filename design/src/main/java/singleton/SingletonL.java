package singleton;

public class SingletonL {
    /**
     * 优点:解决线程安全，延迟初始化( Effective Java推荐写法)
     */
    private SingletonL() {
        System.out.println("=====l======");
    }

    public static SingletonL getInstance() {
        System.out.println("=====l======");
        return Holder.SINGLE_TON;
    }

    private static class Holder {
        private static final SingletonL SINGLE_TON = new SingletonL();
    }
    public static void main(String[] args) {
        System.out.println("=======");
    }
}
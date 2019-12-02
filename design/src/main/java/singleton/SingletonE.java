package singleton;

public class SingletonE {
    /**
     * 优点：没有线程安全问题，简单
     * 缺点：提前初始化会延长类加载器加载类的时间；如果不使用会浪费内存空间； 不能传递参数
     */
    private static final SingletonE instance = new SingletonE();

    private SingletonE() {
        System.out.println("=====e======");
    }

    ;

    public static SingletonE getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("=======");
    }
}
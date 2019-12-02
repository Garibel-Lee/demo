// 静态变量——>静态代码块——> 构造代码块 ——> 构造函数——> 普通代码块
public class Initializationblock {

    int intA;
    int intB;


    public Initializationblock() {
        System.out.println("无参构造器00000000");
    }

    public Initializationblock(int a) {
        System.out.println("一个参数的构造器");
    }

    {
        intA = 10;
        intB = 15;

        System.out.println("构造初始化块11111");
    }

    {System.out.println("构造初始化块22222"); }

    { System.out.println("构造初始化块33333"); }

    //静态初始化块
    static {System.out.println("静态初始化块01010101"); }

    static {System.out.println("静态初始化块0202020202"); }

    public void method() {
        {
            System.out.println("普通初始化块");
        }
    }
    public static void method1() {
        {
            System.out.println("静态初始化块");
        }
    }

    public static void main(String[] args) {
        Initializationblock initializationblock = new Initializationblock();
        initializationblock.method();
        System.out.println("------------");
        //多打印几个对象的目的是：好看出Static静态代码块只执行一次！！！
        Initializationblock initializationblock2 = new Initializationblock();
        //因为静态块是在类的初始化阶段完成的，因此在创建某个类的第二个对象时，该类的静态块就不会执行了
        initializationblock2.method();
        Initializationblock initializationblock3 = new Initializationblock();
        initializationblock3.method();
    }
/*
 * 静态初始化块01010101
静态初始化块0202020202
构造初始化块11111
构造初始化块22222
构造初始化块33333
无参构造器00000000
普通初始化块
------------
构造初始化块11111
构造初始化块22222
构造初始化块33333
无参构造器00000000
普通初始化块
构造初始化块11111
构造初始化块22222
构造初始化块33333
无参构造器00000000
普通初始化块*/
}

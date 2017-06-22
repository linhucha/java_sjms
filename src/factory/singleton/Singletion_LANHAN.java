package factory.singleton;

/**
 * Created by lyj on 2017/6/22.
 *
 * 单例模式的懒汉式[线程不安全，不可用]
 */
public class Singletion_LANHAN {

    private static Singletion_LANHAN instance=null;

    public Singletion_LANHAN() {
    }


    public static Singletion_LANHAN getInstance(){

        if(instance==null){
            instance=new Singletion_LANHAN();
        }
        return instance;
    }
}


/**
 * 懒汉式线程安全的[线程安全，效率低不推荐使用]
 */
class Singletion_LANHAN2{
   private static Singletion_LANHAN2 instance=null;

    public Singletion_LANHAN2() {

    }

    public static synchronized Singletion_LANHAN2 getInstance(){

        if(instance==null){
            instance=new Singletion_LANHAN2();
        }
        return instance;
    }
}


/**
 * 单例模式懒汉式双重校验锁[推荐用]
 */
class Singletion_LANHAN3{
    /**
     * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
     */
    private static Singletion_LANHAN3 instance=null;

    private Singletion_LANHAN3() {};

    public static Singletion_LANHAN3 getInstance(){
        if (instance == null) {
            synchronized (Singletion_LANHAN3.class) {
                if (instance == null) {
                    instance = new Singletion_LANHAN3();
                }
            }
        }
        return instance;
    }
}



//访问方式   Singletion_LANHAN3 instance = Singletion_LANHAN3.getInstance();



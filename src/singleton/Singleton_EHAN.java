package singleton;

/**
 * Created by lyj on 2017/6/22.
 *
 * 单例模式的饿汉式[可用]
 */
public class Singleton_EHAN {

    private static Singleton_EHAN instance=new Singleton_EHAN();

    private Singleton_EHAN(){};
    public static Singleton_EHAN getInstance(){
        return instance;
    }

}

/**
 * 单例模式的饿汉式变换写法[可用]
 */
class Singleton_EHAN2{
    private static Singleton_EHAN2 instance = null;

    static {
        instance = new Singleton_EHAN2();
    }

    private Singleton_EHAN2() {};

    public static Singleton_EHAN2 getInstance() {
        return instance;
    }
}



//访问方式   Singleton instance = Singleton.getInstance();
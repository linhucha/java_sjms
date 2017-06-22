package singleton;

/**
 * Created by lyj on 2017/6/22.
 *
 * 内部类[推荐用]
 */
public class Singleton_NBN {

    private Singleton_NBN() {}

    private static class SingletonHolder{
        private static Singleton_NBN instance=new Singleton_NBN();
    }

    public static Singleton_NBN getInstance(){
        return SingletonHolder.instance;
    }


    //访问方式   Singleton_NBN instance = Singleton_NBN.getInstance();
}

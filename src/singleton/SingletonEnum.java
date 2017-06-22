package singleton;

/**
 * Created by lyj on 2017/6/22.
 */
public enum SingletonEnum {

    instance;

    private SingletonEnum() {}

    public void method(){
    }

    //访问方式   SingletonEnum.instance.method();
}

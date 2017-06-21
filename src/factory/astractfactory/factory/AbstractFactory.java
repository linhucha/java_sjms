package factory.astractfactory.factory;


import factory.astractfactory.chanpin.BMW320;
import factory.astractfactory.chanpin.BMW523;

/**
 * Created by lyj on 2017/6/21.
 */
public abstract class AbstractFactory {
    public abstract BMW320 createBMW320();
    public abstract BMW523 createBMW523();
}

package factory.astractfactory.factory;

import factory.astractfactory.chanpin.BMW320;
import factory.astractfactory.chanpin.BMW523;

/**
 * Created by lyj on 2017/6/21.
 */
public class DefaultFactory extends AbstractFactory {
    @Override
    public BMW320 createBMW320() {
        return new BMW320();
    }

    @Override
    public BMW523 createBMW523() {
        return new BMW523();
    }
}

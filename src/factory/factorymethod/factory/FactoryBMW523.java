package factory.factorymethod.factory;

import factory.factorymethod.chanpin.BMW523;

/**
 * Created by lyj on 2017/6/21.
 */
public class FactoryBMW523 implements FactoryBMW {

    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}

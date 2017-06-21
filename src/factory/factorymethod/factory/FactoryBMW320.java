package factory.factorymethod.factory;

import factory.factorymethod.chanpin.BMW320;

/**
 * Created by lyj on 2017/6/21.
 */
public class FactoryBMW320 implements FactoryBMW {

    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}

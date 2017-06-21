package factory.factorymethod;

import factory.factorymethod.chanpin.BMW;
import factory.factorymethod.chanpin.BMW523;
import factory.factorymethod.factory.FactoryBMW;
import factory.factorymethod.factory.FactoryBMW320;
import factory.factorymethod.factory.FactoryBMW523;

/**
 * Created by lyj on 2017/6/21.
 */
public class Customer {

    public static void main(String[] args) {
        FactoryBMW factoryBMW320 = new FactoryBMW320();
        BMW bmw320 = factoryBMW320.createBMW();
        //BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}

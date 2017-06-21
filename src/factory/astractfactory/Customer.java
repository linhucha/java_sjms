package factory.astractfactory;

import factory.astractfactory.chanpin.BMW320;
import factory.astractfactory.chanpin.BMW523;
import factory.astractfactory.factory.AbstractFactory;
import factory.astractfactory.factory.DefaultFactory;

/**
 * Created by lyj on 2017/6/21.
 */
public class Customer {

    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        BMW320 v = f.createBMW320();
        v.run();v.a();

        BMW523 w = f.createBMW523();
        w.run();
    }
}

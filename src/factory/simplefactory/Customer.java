package factory.simplefactory;

import factory.simplefactory.chanpin.BMW;
import factory.simplefactory.factory.Factory;

/**
 * Created by lyj on 2017/6/21.
 */
public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}

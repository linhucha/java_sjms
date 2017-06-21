package factory.simplefactory.factory;

import factory.simplefactory.chanpin.BMW;
import factory.simplefactory.chanpin.BMW320;
import factory.simplefactory.chanpin.BMW523;

/**
 * Created by lyj on 2017/6/21.
 */
public class Factory {

    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}

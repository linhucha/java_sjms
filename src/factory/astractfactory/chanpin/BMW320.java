package factory.astractfactory.chanpin;

/**
 * Created by lyj on 2017/6/21.
 */
public class BMW320 extends BMW {

    @Override
    public void run() {
        System.out.println("BMW320-->runing");
    }

    public BMW320() {
        System.out.println("制造-->BMW320");
    }
}

package factory.astractfactory.chanpin;

/**
 * Created by lyj on 2017/6/21.
 */
public class BMW523 extends BMW {

    @Override
    public void run() {
        System.out.println("BMW523-->runing");
    }

    public BMW523() {
        System.out.println("制造-->BMW523");
    }
}

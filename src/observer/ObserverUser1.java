package observer;

/**
 * Created by lyj on 2017/6/20.
 */
public class ObserverUser1 implements Observer {

    private Subject subject;

    public ObserverUser1(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println( "-----ObserverUser1  得到 3D 号码:" + msg + ", 我要记下来。 ");
    }
}

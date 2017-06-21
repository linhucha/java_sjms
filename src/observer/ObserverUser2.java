package observer;

/**
 * Created by lyj on 2017/6/20.
 */
public class ObserverUser2 implements Observer {

    private Subject subject ;

    public ObserverUser2(Subject subject)
    {
        this.subject = subject  ;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println( "-----ObserverUser2  得到 3D 号码:" + msg + ", 我要记下来。 ");
    }
}

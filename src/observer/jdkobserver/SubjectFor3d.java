package observer.jdkobserver;

import java.util.Observable;

/**
 * Created by lyj on 2017/6/20.
 * 主题
 */
public class SubjectFor3d extends Observable{

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}

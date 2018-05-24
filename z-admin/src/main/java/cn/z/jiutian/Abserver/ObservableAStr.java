package cn.z.jiutian.Abserver;

import java.util.Observable;


public abstract class ObservableAStr<P> extends Observable{


    public void execute(P p) {
        setChanged();
        notifyObservers(p);
    }

    public void execute() {
        execute(null);
    }
}

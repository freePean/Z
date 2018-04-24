package cn.z.jiutian.Abserver;

import java.util.Observable;


public abstract class ObservableAStr extends Observable{


    public void execute(){
        setChanged();
        notifyObservers();
    }
}

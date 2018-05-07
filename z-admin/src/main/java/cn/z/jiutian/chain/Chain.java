package cn.z.jiutian.chain;

public abstract class Chain<T> {

    protected Chain<T> next;
    
    protected abstract void next(T condition)  ;
   
    protected Chain<T> getNext(){
        return next;
    }
    
    public void setNext(Chain<T> next) {
        this.next = next;
    }
}

package cn.z.jiutian.singleton;

//双重检查锁 适用于多线程
public class Singleton {

    private static volatile Singleton singleton = null;
    
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        
        return singleton;
    }

}

package cn.z.jiutian.abstractclass;


public abstract class AbstractRegistry implements Registry{

    private static final String str = "0099";
    
    static{
        System.out.println("齐天大圣");
    }
    
     
    @Override
    public void registry() {
        System.out.println(str);
    }

}

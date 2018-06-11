package cn.z.jiutian.io.serializable;

import java.io.Serializable;

public class Person implements Serializable{

    /**
     * <code>serialVersionUID</code> of comment
     */
    private static final long serialVersionUID = 203458681175829577L;
    
    private String name;

//    public Person() {
//        this.name = "混世魔王";
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}

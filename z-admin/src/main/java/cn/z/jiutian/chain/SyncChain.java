package cn.z.jiutian.chain;

import java.util.Map;
import java.util.TreeMap;

public enum SyncChain {

    A(1,A.class),
    B(2,B.class),
    C(3,C.class),
    D(3,D.class),
    E(4,E.class);
    
    private SyncChain(Integer code, Class<?> clazz){
        this.code = code;
        this.clazz = clazz;
    }
    
    private Integer code;
    
    private Class<?> clazz;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }
    
    public static Map<Integer, Class<?>> getEnums(Integer code){
        Map<Integer, Class<?>> maps = new TreeMap<Integer, Class<?>>();
        int i = 1;
        for(SyncChain param: SyncChain.values()){
            if(param.getCode() >= code ){
                maps.put(i++, param.getClazz());
            }
        }
        
        return maps;
    }
    
}

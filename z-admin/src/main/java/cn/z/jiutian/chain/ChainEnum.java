package cn.z.jiutian.chain;

import java.util.Map;
import java.util.TreeMap;

public enum ChainEnum {

    A(1, A.class), B(2, B.class), C(3, C.class), D(4, D.class), E(5, E.class);

    private ChainEnum(int code, Class<?> clazz) {
        // TODO Auto-generated constructor stub
        this.code = code;
        this.clazz = clazz;
    }

    private Integer code;

    private Class<?> clazz;

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public static Map<Integer, Class<?>> getEnums(Integer code) {
        Map<Integer, Class<?>> map = new TreeMap<Integer, Class<?>>();
        for (ChainEnum entry : ChainEnum.values()) {
            if (entry.getCode() >= code) {
                map.put(entry.getCode(), entry.getClazz());
            }
        }

        return map;
    }

}

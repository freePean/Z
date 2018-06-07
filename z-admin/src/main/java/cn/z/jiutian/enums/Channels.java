package cn.z.jiutian.enums;

import java.util.Map;
import java.util.TreeMap;



public enum Channels {
	QQ(1,"QQ"),
	
	WeiXin(2,"微信"),
	
	QZone(3,"QQ空间"),
	
	WeiBo(4,"微博");
	/**
	 * 常量值
	 */
	public Integer code;
	
	/**
	 * 内容
	 */
	public String info;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	Channels(Integer code,String info){
		this.code = code;
		this.info = info;
	}

	public static Channels getEunm(Integer code) {
		if (!Assert.checkParam(code)) {
			return null;
		}
		for (Channels data : Channels.values()) {
			if (Assert.equals(data.getCode(), code)) {
				return data;
			}
		}
		return null;
	}


	public static String getInfo(Integer code, Boolean isView) {
		Channels data = getEunm(code);
		return Assert.checkParam(data) ? data.getInfo() : isView ? "-" : "-";
	}

	public static Map<String, String> getMap() {
		Map<String, String> result = new TreeMap<String, String>();
		for (Channels data : Channels.values()) {
			result.put(String.valueOf(data.getCode()), data.getInfo());
		}
		return result;
	}
}

package cn.z.jiutian.soap.util;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.StringUtils;

public class XmlUtils {

	
	/** 
     * 将对象直接转换成String类型的 XML输出 
     *  
     * @param obj 
     * @return 
     */  
    public static String convertToXml(Object obj, Class<?> clazz) {  
        // 创建输出流  
        StringWriter sw = new StringWriter();  
        try {  
            // 利用jdk中自带的转换类实现  
            JAXBContext context = JAXBContext.newInstance(obj.getClass());  
  
            Marshaller marshaller = context.createMarshaller();  
            // 格式化xml输出的格式  
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,  
                    Boolean.TRUE);  
            // 将对象转换成输出流形式的xml  
            marshaller.marshal(obj, sw);  
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
        return removeTage(sw.toString(), clazz);  
    }  
    
    public static Object xmlToBean(byte[] xmlMessage,Class<?> load) throws JAXBException{
    	JAXBContext context = JAXBContext.newInstance(load);
    	javax.xml.bind.Unmarshaller unm = context.createUnmarshaller();
    	Object obj = unm.unmarshal(new ByteArrayInputStream(xmlMessage));
    	return obj;
    }
    
    public static String removeTage(String xml, Class<?> clazz){
    	String tagStart = "<" + clazz.getSimpleName() + ">" ;
    	String tagEnd = "</" + clazz.getSimpleName() + ">" ;
    	
        return StringUtils.substringBetween(xml, tagStart, tagEnd);
    }
  
}

package cn.z.jiutian.soap.test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.soap.entity.cpsRequest;
import cn.z.jiutian.soap.entity.cpsResponse;
import cn.z.jiutian.soap.util.HttpClientUtil;
import cn.z.jiutian.soap.util.XmlUtils;

public class Test_client_http {  
      
    public static void main(String[] args) {  
        
    	cpsRequest cps = new cpsRequest();
		cps.setBgRetUrl("http://baidu.com");
		cps.setBizId("fqd0000000001");
		cps.setCmdId("?");
		cps.setPageRetUrl("http://baidu.com");
		cps.setSave("?");
		cps.setSignature("99-1223-70-46-64-134248-110-5445101-821-5");
		cps.setSystemSourceId("OMP");
		cps.setUserId("23");
		cps.setBusiCode("AAAAAA");
		cps.setCardId("230102199302093719");
		cps.setGuarType("N");
		cps.setInstuCode("00000001");
		cps.setMobilePhone("13918009275");
		cps.setRealName("孙胜宇");
		cps.setTaxCode("00000101");
		cps.setUserNature("2");
		
		String str = XmlUtils.convertToXml(cps, cpsRequest.class);
            
        String serviceWsdl = "http://192.168.1.83:8080/Route/webservice/routeWs?wsdl";  
        Object obj =  HttpClientUtil.sendPostRequest(serviceWsdl, str, cpsResponse.class, "cpsDoRegister");  
        cpsResponse cp = (cpsResponse) obj;
        System.out.println(JSON.toJSON(cp));
    }  
  
}
package cn.z.jiutian.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("a")
public class A extends Chain<OrderVo>{

    private static final Logger LOG = LoggerFactory.getLogger(A.class);
    
    protected void next(OrderVo condition) {
        LOG.info("-------------A----------------");
        
        if(getNext() != null ){
            getNext().next(condition);;
        }
    }
}

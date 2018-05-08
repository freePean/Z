package cn.z.jiutian.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("c")
public class C extends Chain<OrderVo>{

    private static final Logger LOG = LoggerFactory.getLogger(C.class);
    
    @Override
    protected void next(OrderVo condition) {
        LOG.info("------C-------");
        
//        if(getNext() != null){
//            getNext().next(condition);
//        }
    }
}

package cn.z.jiutian.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.z.jiutian.enums.Assert;

@Service
public class D extends Chain<OrderVo>{

    private static final Logger LOG = LoggerFactory.getLogger(D.class);
    
    @Override
    protected void next(OrderVo condition) {
        LOG.info("-------D----------");
        
        if(Assert.checkParam(getNext())){
            getNext().next(condition);
        }
    }

}

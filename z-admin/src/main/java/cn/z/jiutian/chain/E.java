package cn.z.jiutian.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.z.jiutian.enums.Assert;

@Service
public class E extends Chain<OrderVo>{

    private static final Logger LOG = LoggerFactory.getLogger(E.class);
    
    
    @Override
    protected void next(OrderVo condition) {
        // TODO Auto-generated method stub
        LOG.info("-----------E----------------");
        
        if(Assert.checkParam(getNext())){
            getNext().next(condition);
        }
    }

}

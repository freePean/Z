package cn.z.jiutian.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private Chain<OrderVo> a;
    
//    @Autowired
//    private Chain<OrderVo> b;
//    
//    @Autowired
//    private Chain<OrderVo> c;
    
    public void execute(){
        OrderVo oo = new OrderVo();
        a.next(oo);
    }

}

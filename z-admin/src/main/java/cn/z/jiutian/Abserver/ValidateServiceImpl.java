package cn.z.jiutian.Abserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateServiceImpl {

    @Autowired
    private ValidateRouter validateRouter;

    public void execute(RequestParam param){
        validateRouter.execute(param);
    }
}

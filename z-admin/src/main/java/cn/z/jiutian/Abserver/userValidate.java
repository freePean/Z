package cn.z.jiutian.Abserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class userValidate extends ValidateObserver{

    private static final Logger LOG = LoggerFactory.getLogger(userValidate.class);
    
	@Override
	public boolean supports(RequestParam t) {
		// TODO Auto-generated method stub
		return t.getType().equals("user");
	}
	
    @Override
    protected void execute(RequestParam param) {
        LOG.info("userValidate's type is {}", param.getType());
    }

}

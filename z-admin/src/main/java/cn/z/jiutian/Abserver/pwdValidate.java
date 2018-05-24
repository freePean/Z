package cn.z.jiutian.Abserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class pwdValidate extends ValidateObserver{

    private static final Logger LOG = LoggerFactory.getLogger(pwdValidate.class);
    
	@Override
	public boolean supports(RequestParam t) {
		// TODO Auto-generated method stub
		return t.getType().equals("pwd");
	}
   
    @Override
    protected void execute(RequestParam param) {
        LOG.info("pwdValidate's type is {}", param.getType());
    }

}

package cn.z.jiutian.Abserver;

import org.springframework.stereotype.Service;

@Service
public class userValidate extends ValidateObserver{

	@Override
	public boolean spport(RequestParam t) {
		// TODO Auto-generated method stub
		return t.equals("user");
	}
	
    @Override
    protected void execute() {
        System.out.println("userValidate================");
    }

}

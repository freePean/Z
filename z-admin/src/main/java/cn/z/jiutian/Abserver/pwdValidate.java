package cn.z.jiutian.Abserver;

import org.springframework.stereotype.Service;


@Service
public class pwdValidate extends ValidateObserver{

	@Override
	public boolean spport(RequestParam t) {
		// TODO Auto-generated method stub
		return t.equals("pwd");
	}
   
    @Override
    protected void execute() {
        System.out.println("pwdValiadte================");
    }

}

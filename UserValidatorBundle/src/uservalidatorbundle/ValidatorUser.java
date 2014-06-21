package uservalidatorbundle;
/**
 * 
 * @author Administrator
 * 用户登录验证服务接口
 */
public interface ValidatorUser {
    
	
	
	/**
	 * 根据用户名和密码验证用户是否能够登录
	 */
	
	public Boolean validate(String userName,String passWord)throws Exception;
	
	
	
}

package uservalidatorbundle;
/**
 * 
 * @author Administrator
 * �û���¼��֤����ӿ�
 */
public interface ValidatorUser {
    
	
	
	/**
	 * �����û�����������֤�û��Ƿ��ܹ���¼
	 */
	
	public Boolean validate(String userName,String passWord)throws Exception;
	
	
	
}

package talon.dao;  
  
  
import talon.domain.User;  
  
/** 
 * ���ܸ�Ҫ��User��DAO�� 
 *  
 * @author linbingwen 
 * @since 2015��9��28�� 
 */  
public interface UserDao {  
    /** 
     *  
     * @author linbingwen 
     * @since 2015��9��28�� 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
  
}  
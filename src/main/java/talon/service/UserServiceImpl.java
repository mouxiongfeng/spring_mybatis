package talon.service;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import talon.dao.UserDao;  
import talon.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserServiceʵ���� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
  
}  
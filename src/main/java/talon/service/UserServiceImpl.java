package talon.service;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import talon.dao.UserDao;  
import talon.domain.User;  
  
/** 
 * 功能概要：UserService实现类 
 *  
 * @author linbingwen 
 * @since  2015年9月28日  
 */  
@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
  
}  
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public User userById(Long id) {
        return userDao.userById(id);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    public List<User> listOfUsers() {
        return userDao.listOfUsers();
    }


}

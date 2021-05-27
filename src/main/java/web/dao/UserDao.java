package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(1, "Thomas", "Shord", "thomas_shord@new-mail.ru"));
        users.add(new User(2, "Erick", "Pierce", "erick_pierce@new-mail.ru"));
        users.add(new User(3, "William", "Peters", "william_peters@new-mail.ru"));
        users.add(new User(4, "Grace", "Walsh", "grace_walsh@new-mail.ru"));
        users.add(new User(5, "Katherine", "McCarthy", "katherine_mccarthy@new-mail.ru"));
    }

    public List<User> listOfUsers() {
        return users;
    }

    public User userById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}

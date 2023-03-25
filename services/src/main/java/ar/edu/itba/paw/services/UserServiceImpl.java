package ar.edu.itba.paw.services;

import ar.edu.itba.paw.User;
import daos.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao ud;

    @Autowired
    public UserServiceImpl(final UserDao ud) {
        this.ud = ud;
    }
    @Override
    public User login(String username, String password) {
        return this.ud.create(username, password);
    }

    public User findById(String id) {
        return new User("", "");
    }
}

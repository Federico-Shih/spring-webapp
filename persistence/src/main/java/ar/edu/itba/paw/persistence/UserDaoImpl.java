package ar.edu.itba.paw.persistence;

import ar.edu.itba.paw.User;
import daos.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public User create(final String email, final String password) {
        return new User(email, password);
    }
}

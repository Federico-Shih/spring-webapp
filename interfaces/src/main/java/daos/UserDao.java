package daos;

import ar.edu.itba.paw.User;

public interface UserDao {
    User create(final String email, final String password);
}

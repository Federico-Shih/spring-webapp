package ar.edu.itba.paw.services;

import ar.edu.itba.paw.User;

public interface UserService {
    User login(String username, String password);
    User findById(String id);
}

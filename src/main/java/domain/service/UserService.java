package domain.service;

import domain.model.User;

import java.util.List;

public interface UserService {

    Iterable <User> getAll();
    User findById(Long id);
    User create(User userToCreate);
}

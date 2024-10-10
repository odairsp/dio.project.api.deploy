package domain.service.impl;

import domain.model.User;
import domain.repository.UserRepository;
import domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        return null;
    }
}

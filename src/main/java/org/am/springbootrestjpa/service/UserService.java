package org.am.springbootrestjpa.service;

import org.am.springbootrestjpa.entity.User;
import org.am.springbootrestjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The UserService class.
 *
 * @author Alexander Maximenya
 * @version 2017-12-13
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public int save(List<User> users) {
        return userRepository.save(users).size();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        return userRepository.findOne(id);
    }

    public List<User> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public List<User> findByUserNameFirstName(String userName, String firstName) {
        return userRepository.findByUserNameAndFirstName(userName, firstName);
    }
}

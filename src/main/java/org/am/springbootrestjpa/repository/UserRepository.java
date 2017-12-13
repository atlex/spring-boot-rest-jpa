package org.am.springbootrestjpa.repository;

import org.am.springbootrestjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * The UserRepository class.
 *
 * @author Alexander Maximenya
 * @version 2017-12-13
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUserName(@Param("userName") String userName);
    List<User> findByFirstName(@Param("firstName") String firstName);
    List<User> findByUserNameAndFirstName(@Param("userName") String userName, @Param("firstName") String firstName);
}

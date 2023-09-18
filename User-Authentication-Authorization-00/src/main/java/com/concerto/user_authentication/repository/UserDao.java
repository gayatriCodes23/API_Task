package com.concerto.user_authentication.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concerto.user_authentication.dao.DAOUser;


@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
}
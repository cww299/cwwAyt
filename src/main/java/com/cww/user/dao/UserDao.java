package com.cww.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cww.user.pojo.User;

public interface UserDao extends JpaRepository<User,Integer>{

}

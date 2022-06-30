package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
    extends JpaRepository<User, Long>, QuerydslPredicateExecutor<User> {}

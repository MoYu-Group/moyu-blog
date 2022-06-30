package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentsRepository
    extends JpaRepository<Contents, Long>, QuerydslPredicateExecutor<Contents> {}

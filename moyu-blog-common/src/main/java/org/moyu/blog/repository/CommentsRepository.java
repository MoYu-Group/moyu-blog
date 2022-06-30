package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author fuhaixin
 * @date 2022/6/29
 */
@Repository
public interface CommentsRepository
    extends JpaRepository<Comments, Long>, QuerydslPredicateExecutor<Comments> {}

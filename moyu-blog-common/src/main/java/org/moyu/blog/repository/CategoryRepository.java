package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author fuhaixin
 * @date 2022/6/30
 */
public interface CategoryRepository
    extends JpaRepository<Category, Long>, QuerydslPredicateExecutor<Category> {}

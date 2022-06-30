package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fuhaixin
 * @date 2022/6/29
 **/
@Repository
public interface TagRepository extends JpaRepository<Category, Long> {

}



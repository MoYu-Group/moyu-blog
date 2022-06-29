package org.moyu.blog.common;

import org.moyu.blog.common.pojo.entity.CATEGORY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fuhaixin
 * @date 2022/6/29
 **/
@Repository
public interface TagRepository extends JpaRepository<CATEGORY, Long> {

}



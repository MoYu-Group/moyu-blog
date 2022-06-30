package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Repository
public interface OptionsRepository extends JpaRepository<Options, Long> {

}

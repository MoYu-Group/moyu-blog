package org.moyu.blog.repository;

import org.moyu.blog.common.pojo.entity.ContentElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentElementRepository extends JpaRepository<ContentElement, Long> {

}
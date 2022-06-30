package org.moyu.service;

import org.moyu.blog.common.pojo.entity.QContents;
import org.moyu.blog.repository.ContentsRepository;
import org.springframework.stereotype.Service;

/**
 * @author fuhaixin
 * @date 2022/6/30
 */
@Service
public class ContentsServiceImpl {

  private final ContentsRepository contentsRepository;

  public ContentsServiceImpl(ContentsRepository contentsRepository) {
    this.contentsRepository = contentsRepository;
  }

  public void findAll() {
    var contents = QContents.contents;
    var expression = contents.content.length().loe(10);
    contentsRepository.findAll(expression);
  }
}

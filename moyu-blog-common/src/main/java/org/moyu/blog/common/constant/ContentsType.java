package org.moyu.blog.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see org.moyu.blog.common.pojo.entity.Contents 该类型的内容类型
 **/
@Getter

@AllArgsConstructor
public enum ContentsType {

    ARTICLE(0, "文章"),
    SKETCH(1, "草稿"),
    SINGLE_PAGE(2, "独立页面");
    private final Integer code;
    private final String desc;
}

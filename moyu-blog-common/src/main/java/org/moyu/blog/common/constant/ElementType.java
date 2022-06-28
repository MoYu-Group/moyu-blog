package org.moyu.blog.common.constant;

import io.github.moyugroup.base.model.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see org.moyu.blog.common.pojo.entity.ContentElement 该类的内容类型
 **/
@Getter

@AllArgsConstructor
public enum ElementType implements BaseEnum {
    CATEGORY(0, "分类"),
    TAG(1, "标签");
    private final Integer code;
    private final String desc;
}

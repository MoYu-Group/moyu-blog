package org.moyu.blog.common.constant;

import io.github.moyugroup.base.model.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see org.moyu.blog.common.pojo.entity.Contents 文档的状态
 **/
@Getter
@AllArgsConstructor
public enum ContentsStatus implements BaseEnum {
    TO_BE_AUDITED(0, "待审核"),
    RELEASE(1, "发布");
    private final Integer code;
    private final String desc;
}

package io.github.moyugroup.blog.common.constant;

import io.github.moyugroup.base.model.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see io.github.moyugroup.blog.common.pojo.entity.Comment 评论的状态
 **/
@Getter
@AllArgsConstructor
public enum CommentStatus implements BaseEnum {
    TO_BE_AUDITED(0, "待审核"),
    PASSED(1, "通过"),
    SPAM_COMMENTS(2, "垃圾评论");
    private final Integer code;
    private final String desc;

}

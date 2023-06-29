package io.github.moyugroup.blog.common.constant;

import io.github.moyugroup.blog.common.pojo.entity.ContentElement;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see ContentElement 该类的内容类型
 **/
@Getter
@AllArgsConstructor
public enum ElementType {
    CATEGORY(0, "分类"),
    TAG(1, "标签");
    private final Integer code;
    private final String desc;


    public static class ContentElementType {

        public static final String CATEGORY = "0";
        public static final String TAG = "1";
        private ContentElementType() {
        }
    }
}

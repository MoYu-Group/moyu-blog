package io.github.moyugroup.blog.common.constant;

import io.github.moyugroup.base.model.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Getter

@AllArgsConstructor
public enum FileSaveType implements BaseEnum {
    LOCAL(0, "本地存储"),
    TENCENT(1, "腾讯云存储"),
    ALIYUN(2, "阿里云存储");
    private final Integer code;
    private final String desc;
}

package org.moyu.blog.common.jpa.audit;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * 审计字段获取当前登录用户
 **/
public class JpaAuditorAware implements AuditorAware<Long> {

    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor.
     */
    @Override
    public Optional<Long> getCurrentAuditor() {
        return Optional.empty();
    }
}

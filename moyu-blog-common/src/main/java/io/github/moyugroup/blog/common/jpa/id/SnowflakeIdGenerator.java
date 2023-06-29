package io.github.moyugroup.blog.common.jpa.id;

import io.github.moyugroup.base.util.UUIDUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
public class SnowflakeIdGenerator implements IdentifierGenerator {

    /**
     * Generate a new identifier.
     *
     * @param session The session from which the request originates
     * @param object  the entity or collection (idbag) for which the id is being generated
     * @return a new identifier
     * @throws HibernateException Indicates trouble generating the identifier
     */
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object)
        throws HibernateException {
        return UUIDUtil.generateId();
    }
}

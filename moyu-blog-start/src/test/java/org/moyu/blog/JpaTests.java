package org.moyu.blog;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.moyu.blog.common.CommentsRepository;
import org.moyu.blog.common.OptionsRepository;
import org.moyu.blog.common.constant.CommentStatus;
import org.moyu.blog.common.pojo.entity.Comments;
import org.moyu.blog.common.pojo.entity.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/**
 * @author fuhaixin
 * @date 2022/6/29
 **/
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class JpaTests {


    @Autowired
    private OptionsRepository optionsRepository;
    @Autowired
    private CommentsRepository commentsRepository;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    void testAudit() {
        var options = new Options();
        options.setName("测试数据3");
        entityManager.persist(options);
        assertThat(options.getCreateTime()).isNotNull();


    }

    @Test
    void testEnum2Repository() {
        var comments = new Comments();
        comments.setComment("测试评论2");
        comments.setStatus(CommentStatus.SPAM_COMMENTS);
        entityManager.persist(comments);
        assertThat(comments.getStatus().getCode()).isEqualTo(CommentStatus.SPAM_COMMENTS.getCode());
    }



}


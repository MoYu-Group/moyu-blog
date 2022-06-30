package org.moyu.blog;


import org.junit.jupiter.api.Test;
import org.moyu.blog.repository.TagRepository;
import org.moyu.blog.common.pojo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {


    @Autowired
    TagRepository tagRepository;

    @Test
    void contextLoads() {
    }

    @Test
     void Test() {
        System.out.println("moyu-blog test !!!");
    }

    @Test
    void testInheritance() {
        var tag = new Category();
        tag.setShortName("测试简称");
        tag.setName("测试标签");
        tag.setDesc("测试描述");
        tag.setOrder(1);
//        entityManager.persist(tag);
        tagRepository.save(tag);
        var tagOptional = tagRepository.findById(tag.getId());
        var tagCase = tagOptional.orElseThrow(() -> new RuntimeException("查询失败"));
//        assertThat(tagCase.getType().getCode()).isEqualTo(ElementType.Tag.getCode());

    }
}

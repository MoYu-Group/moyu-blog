package org.moyu.blog;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.moyu.blog.common.OptionsRepository;
import org.moyu.blog.common.pojo.entity.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    OptionsRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void Test() {
        System.out.println("moyu-blog test !!!");
    }

    @Test
    void testMapper() {
        var options = new Options();
        options.setName("测试数据3");
        repository.save(options);
        repository.findById(options.getId());
        Assertions.assertNotNull(options.getCreateTime());

    }
}

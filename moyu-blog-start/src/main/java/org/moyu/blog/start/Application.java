package org.moyu.blog.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动类
 * <p>
 * Created by fanfan on 2022/05/19.
 */
@SpringBootApplication(
        //扫描MoYu框架中的类
        scanBasePackages = {"org.moyu", "io.github.moyugroup"}
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package com.example.elk;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class Elasticsearch {

    @Resource
    BlogEsRepository blogEsRepository;

    @Test
    void search() {
        Blog blog = new Blog();
        blog.setId("4");
        blog.setContent("content.");
        blog.setTitle("title.");
        blogEsRepository.save(blog);
    }
}

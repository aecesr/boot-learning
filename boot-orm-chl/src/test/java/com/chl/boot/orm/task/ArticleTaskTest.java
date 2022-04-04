package com.chl.boot.orm.task;

import com.chl.boot.orm.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleTaskTest {
    @Resource
    private ArticleTask articleTask;


    @Test
    void getArticles() throws Exception{
        ThreadPoolExecutor executor=new ThreadPoolExecutor(4,8,5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Future<List<Article>> future = executor.submit(articleTask);
        List<Article> articles = future.get();
        System.out.println(articles);
    }
}
package com.chl.boot.orm.task;

import com.chl.boot.orm.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @program: boot-learning
 * @description:爬虫类
 * @Author: 曹红亮
 * @create: 2022-03-28 15:59
 **/
@Component
@Slf4j
public class ArticleTask implements Callable<List<Article>> {
    private static final String BASE_URL = "https://godweiyang.com";
    private List<Article> articleList;

    @Override
    public List<Article> call() throws Exception {
        articleList = new ArrayList<>(100);
        Document document = null;
        //页码
        int index;
        for (index = 2; index <= 5; index++) {
            document = Jsoup.connect(BASE_URL + "/page/" + index).get();
            Elements cards = document.getElementsByClass("card");
            parseCards(cards);
        }
        return articleList;
    }

    private void parseCards(Elements cards) {
        for (Element card : cards) {
            //文章id自增
            //文章标题
            Element titleNode = card.select(".card-title").get(0);
            String title = titleNode.text();
            System.out.println(title);
            //文章分类
            Element imgNode = card.select(".responsive-img").get(0);
            String cover = BASE_URL + imgNode.attr("src");
            System.out.println(cover);
            //文章分类
            Element categoryNode = card.select(".post-category").get(0);
            String category = categoryNode.html();
            System.out.println(category);
            //文章链接
            String url =BASE_URL+ categoryNode.attr("href");
            System.out.println(url);

            //随机生成用户id[1,5]
            Random random = new Random();
            int userid = random.nextInt(5)+1;

            //文章摘要
            Element summaryNode = card.select(".summary").get(0);
            String summary = summaryNode.html();

            //

            //封装文章对象
            Article article = Article.builder()
                    .title(title)
                    .cover(cover)
                    .summary(summary)
                    .build();
            articleList.add(article);
        }

    }

    public static void main(String[] args) throws Exception{
        ArticleTask articleTask = new ArticleTask();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<List<Article>> submit = executor.submit(articleTask);
        List<Article> articles = submit.get();
        articles.forEach(article -> System.out.println(article.getTitle()+","+ article.getCover()));
    }
}

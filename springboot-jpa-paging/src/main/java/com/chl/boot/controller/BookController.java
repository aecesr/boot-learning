package com.chl.boot.controller;

import com.chl.boot.entity.Book;
import com.chl.boot.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.nio.file.Path;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-19 10:39
 **/
@RestController
@RequestMapping("/api/Book")
public class BookController {
    @Resource
    BookService bookService;

    @GetMapping("/BookNoQuery")
    public Page<Book> findBookNoCriteria(@RequestParam Integer page, @RequestParam Integer size) {
        Page<Book> books = bookService.findBookNoCriteria(page, size);
        return books;
    }


    @GetMapping("/BookQuery")
    public Page<Book> findBookCriteria(@RequestParam Integer page, @RequestParam Integer size, Integer id, String cover, String name) {
        Book book = Book.builder().id(id).cover(cover).name(name).build();
        Page<Book> books = bookService.findBookCriteria(page, size, book);
        return books;
    }
}

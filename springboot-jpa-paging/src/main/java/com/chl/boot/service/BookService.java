package com.chl.boot.service;

import com.chl.boot.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {

    /**
     * 不带条件的分页
     * @param page
     * @param size
     * @return
     */
    Page<Book> findBookNoCriteria(Integer page,Integer size);


    /**
     * 带条件的查询
     * @param page
     * @param size
     * @param book
     * @return
     */
    Page<Book> findBookCriteria(Integer page,Integer size,Book book);
}

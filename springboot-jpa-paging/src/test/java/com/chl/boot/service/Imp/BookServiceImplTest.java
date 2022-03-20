package com.chl.boot.service.Imp;

import com.chl.boot.dao.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class BookServiceImplTest {

    @Resource
    BookRepository bookRepository;
    @Test
    void findBookNoCriteria() {
        bookRepository.findAll();
    }
}
package com.zezai;

import com.zezai.dao.BookDao;
import com.zezai.domain.tbl_book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void getAll() {//查询全部
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void getById() {//查询单个
        System.out.println(bookDao.selectById(19));
    }

    @Test
    void Save(){//插入
        tbl_book book=new tbl_book();
        book.setType("计算机指导丛书");
        book.setName("数据结构");
        book.setDescription("头皮发麻");
        bookDao.insert(book);
    }

    @Test
    void Delete(){//删除
        bookDao.deleteById(20);
    }

    @Test
    void Update(){//修改
        tbl_book book=new tbl_book();
        book.setId(19);                           //我们不需要修改的部分可以不用管,只需要设置要改的内容
        book.setDescription("有点东西");
        bookDao.updateById(book);
    }
}

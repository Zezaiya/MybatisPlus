package com.zezai;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zezai.dao.BookDao;
import com.zezai.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
        Book book=new Book();
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
        Book book=new Book();
        book.setId(19);                           //我们不需要修改的部分可以不用管,只需要设置要改的内容
        book.setDescription("有点东西");
        bookDao.updateById(book);                //记住,传入的是实体类对象!!!!!!
    }

    @Test
    void SelectByCondition1(){//按条件查询(方法1)
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.lt("id",10);           //通过对wrapper对象进行操作来增加条件,这里是限制
        List<java.awt.print.Book> bookList=bookDao.selectList(wrapper);
        System.out.println(bookList);
    }

    @Test
    void SelectByCondition2(){//按条件查询(方法2)
        LambdaQueryWrapper<Book> lqw= new LambdaQueryWrapper<>();
        lqw.lt(Book::getId,10);     //通过Lambda可以直接使用我们实体类的get方法获取数据,防止我们写错
        List<Book> bookList=bookDao.selectList(lqw);
        System.out.println(bookList);
    }
}

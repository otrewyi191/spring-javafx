package sample.persistence;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.TestBase;

import javax.sql.DataSource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class BookDaoImplTest extends TestBase {


    @Autowired
    ApplicationContext applicationContext;
    private BookService bookService = null;

    @Test
    public void test() {
        DataSource dataSource = (DataSource) applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void test2() {
        bookService = applicationContext.getBean(BookService.class);
        String bookName = bookService.findBookById(1);
        System.out.println(bookName);
    }

    @Test
    public void test3() {
        bookService.saveBook(new Book(2, "android源码分析", "1002", 45, 10));
    }
}
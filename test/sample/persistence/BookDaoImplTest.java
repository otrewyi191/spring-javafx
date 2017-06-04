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

    @Autowired
    private BookService bookService;

    @Test
    public void test() {
        DataSource dataSource = (DataSource) applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void test3() {
        bookService.saveBook(new Book(1, "android源码分析", "1002", 45, 10));
    }

    @Test
    public void test2() {
        bookService.saveBook(new Book(1, "android源码分析", "1002", 45, 10));

        String bookName = bookService.findBookById(1);
        System.out.println(bookName);
    }
}
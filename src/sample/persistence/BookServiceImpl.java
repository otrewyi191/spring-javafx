package sample.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;
    public String findBookById(int id)
    {
        return bookDao.findBookById(id);
    }
    public void saveBook(Book book)
    {
        bookDao.saveBook(book);

    }
}
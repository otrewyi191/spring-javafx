package sample.persistence;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public interface BookDao
{
    public String findBookById(int id);

    public void saveBook(Book book);
}
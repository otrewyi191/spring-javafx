package sample.persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Transactional
@Repository
public class BookDaoImpl implements BookDao
{
    @Resource
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.openSession();
    }
    public String findBookById(int id)
    {
        //String hql="SELECT bookName from Book where id=?";
        String hql="SELECT count(*) from Book where id=?";
        Query query=getSession().createQuery(hql).setInteger(0, id);
        String str= query.uniqueResult().toString();
        return str;
    }
    public void saveBook(Book book)
    {
        getSession().save(book);
    }
}
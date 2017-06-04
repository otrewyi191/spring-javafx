package sample.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sample.TestBase;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class MessageTest extends TestBase{

    @Autowired
    SessionFactory sessionFactory;

    @Test
    public void test01() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");

    }
}
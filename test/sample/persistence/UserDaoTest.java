package sample.persistence;

import org.h2.engine.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import java.sql.ResultSet;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
    public class UserDaoTest {
        private EmbeddedDatabase db;
        @Before
        public void setUp() {
            //db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
            db = new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2)
                    .addScript("db/sql/create-db.sql")
                    .addScript("db/sql/insert-data.sql")
                    .build();
        }
        @Test
        public void testFindByname() {
            NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(db);
            String query = template.query("select * from users;", ResultSet::toString);
        }
        @After
        public void tearDown() {
            db.shutdown();
        }
}

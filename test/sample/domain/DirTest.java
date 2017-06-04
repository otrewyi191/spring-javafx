package sample.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import sample.TestBase;
import sample.application.entity.Dir;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@ActiveProfiles("sep")
public class DirTest extends TestBase{
    @Autowired
    Dir dir;


    @Test
    public void test1()
    {
        assert !dir.getBaseDir().isEmpty();
    }
    @Test
    public void test2()
    {
    }


}
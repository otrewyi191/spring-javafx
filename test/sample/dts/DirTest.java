package sample.dts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.TestBase;

import java.util.List;

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
        dir.listDir();
    }


}
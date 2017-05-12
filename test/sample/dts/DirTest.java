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
public class DirTest extends TestBase{
    @Autowired
    Dir dir;

    @Value("#{'${ips}'.split(',')}")
    List<String> ipList;

    @Test
    public void test1()
    {
        dir.listDir();
    }

    @Test
    public void test2() {
        assert !ipList.isEmpty();
    }
}
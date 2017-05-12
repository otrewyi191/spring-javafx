package sample.hwm.add;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import sample.TestBase;
import sample.hwm.AddServer;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@ActiveProfiles(value = "sep")
public class SepConfigTest extends TestBase {

    @Autowired
    private AddServer addServer;

    @Test
    public void test1()
    {
        assert addServer != null;
    }
    @Test
    public void test2()
    {
        assert addServer.add("1.2.3.4").equalsIgnoreCase("sep added");
    }

}
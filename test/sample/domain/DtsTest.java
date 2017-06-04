package sample.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sample.TestBase;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class DtsTest extends TestBase {
    @Autowired
    private Dts dts;

    @Test
    public void getDtsNumber() throws Exception {
        String dtsNum=dts.getDtsNumber("DTS242358397");
        System.out.println(dtsNum);
    }

}
package sample.domain.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import sample.TestBase;
import sample.domain.entity.Dts;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class DtsServiceTest extends TestBase{
    @Autowired
    DtsService dtsService;

    @Autowired
    Dts dtsEntity;

    @Test
    public void test01() throws Exception {
        dtsService.setDtsNum(String.valueOf(1111111111));
        System.out.println(dtsEntity.getDts());
    }

}
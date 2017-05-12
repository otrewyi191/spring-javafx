package sample.dts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Component
public class Dir {
    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getDts() {
        return dts;
    }

    public void setDts(String dts) {
        this.dts = dts;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Value("${baseDir}")
    private String baseDir;

    private String dts;
    private String desc;

    public void listDir() {
        System.out.println("baseDir:[zzx]"+baseDir);
    }
}

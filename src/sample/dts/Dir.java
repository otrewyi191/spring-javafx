package sample.dts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Component
public class Dir {

    //目录后面要带/
    //配置文件里面不带引号
    @Value("${dts.filepath:E:\\}")
    private String dirName;

    public void listDir() {
        File dir = new File(dirName);
        File[] files = dir.listFiles();

        Arrays.stream(files).map(f->f.toString()).forEach(System.out::println);

    }
}

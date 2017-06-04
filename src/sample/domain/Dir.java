package sample.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Value("${baseDir}")
    private String baseDir;



    public List<String> listDir() {
        File dir = new File(baseDir);
        File[] files = dir.listFiles();
        return Arrays.stream(files).map(File::getName).collect(Collectors.toList());
    }
}

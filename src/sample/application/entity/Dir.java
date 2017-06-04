package sample.application.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sample.domain.entity.Dts;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Component
public class Dir {
    @Value("${baseDir}")
    private String baseDir;

    public String getDtsDirName() {
        return dtsDirName;
    }

    public void setDtsDirName(String dtsDirName) {
        this.dtsDirName = dtsDirName;
    }

    private String dtsDirName;


}

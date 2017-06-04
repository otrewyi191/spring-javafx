package sample.domain;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class Dts {
    private String dts;
    private String desc;

    public String getDtsNumber(String s) {
        Pattern p = Pattern.compile("(DTS\\d+)");
        Matcher m = p.matcher(s);
        boolean b = m.matches();

        if (m.find()) {
            System.out.println(m.group());
        }
        //return m.group(0);
        return s;
    }

}

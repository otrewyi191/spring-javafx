package sample.domain.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class DirService {

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

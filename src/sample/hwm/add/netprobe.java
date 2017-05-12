package sample.hwm.add;

import sample.hwm.AddServer;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
public class netprobe implements AddServer {

    @Override
    public String add(String IP) {
        System.out.println("netprobe added");
        return "netprobe added";
    }
}

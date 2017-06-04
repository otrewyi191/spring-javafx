package sample.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Entity
public class Message {

    @Id
    @GeneratedValue
    private  long id;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

}

package customer.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tab {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date=new Date();
    private String timeCreated;
    public Tab() {

        timeCreated=dateFormat.format(date);
    }

    public String getTimeCreated() {
        return timeCreated;
    }
}

package customer.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TabCreated extends ParentEvent {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date=new Date();
    private String timeCreated;
    public TabCreated(UUID uuid) {
        super(uuid);
        timeCreated=dateFormat.format(date);
    }

    public String getTimeCreated() {
        return timeCreated;
    }
    public String toString(){
        return "ID: "+this.getUuid()+"  Time created: "+this.timeCreated;
    }
}

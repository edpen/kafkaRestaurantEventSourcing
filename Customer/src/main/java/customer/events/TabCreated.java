package customer.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TabCreated implements ParentEvent {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date=new Date();
    private String timeCreated;
    private final UUID uuid;

    public TabCreated() {
        timeCreated=dateFormat.format(date);
        this.uuid = UUID.randomUUID();

    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTimeCreated() {
        return timeCreated;
    }
    public String toString(){
         return "ID: "+this.getUuid()+"  Time created: "+this.timeCreated;
    }
}

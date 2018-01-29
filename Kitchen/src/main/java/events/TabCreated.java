package events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TabCreated extends ParentEvent {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date=new Date();
    String timeCreated;
    public TabCreated(UUID uuid) {
        super(uuid);
        timeCreated=dateFormat.format(date);
    }
}

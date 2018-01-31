package customer.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TabClosed implements ParentEvent {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date=new Date();
    private String timeCreated;
    private String closingMessage;
    private final UUID uuid;

    public TabClosed(String message) {

        timeCreated=dateFormat.format(date);
        this.closingMessage=message;
        this.uuid = UUID.randomUUID();

    }

    public UUID getUuid() {
        return uuid;
    }

    public String getClosingMessage() {
        return closingMessage;
    }

    public void setClosingMessage(String closingMessage) {
        this.closingMessage = closingMessage;
    }

    public String getTimeCreated() {
        return timeCreated;
    }
    public String toString(){
        return "ID: "+this.getUuid()+"  Time created: "+this.timeCreated;
    }
}

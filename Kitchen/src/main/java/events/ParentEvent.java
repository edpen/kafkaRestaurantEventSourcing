package events;

import java.util.UUID;

public class ParentEvent {
    private final UUID uuid;

    public ParentEvent(UUID uuid) {
        this.uuid = uuid;
    }
}

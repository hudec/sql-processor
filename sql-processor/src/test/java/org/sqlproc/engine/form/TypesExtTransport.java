package org.sqlproc.engine.form;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TypesExtTransport {

    Long id;
    UUID t_uuid;
    OffsetDateTime t_offset_date_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getT_uuid() {
        return t_uuid;
    }

    public void setT_uuid(UUID t_uuid) {
        this.t_uuid = t_uuid;
    }

    public OffsetDateTime getT_offset_date_time() {
        return t_offset_date_time;
    }

    public void setT_offset_date_time(OffsetDateTime t_offset_date_time) {
        this.t_offset_date_time = t_offset_date_time;
    }
}

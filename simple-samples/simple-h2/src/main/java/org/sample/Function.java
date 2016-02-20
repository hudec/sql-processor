package org.sample;

import java.sql.Timestamp;

public class Function {

    public static Timestamp anHourBefore(Timestamp t) {
        if (t == null)
            return null;
        Timestamp t2 = new Timestamp(t.getTime() - 1000 * 3600);
        t2.setNanos(t.getNanos());
        return t2;
    }
}

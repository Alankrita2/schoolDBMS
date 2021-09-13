package com.brillio.example.firstRestService;

import java.io.Serializable;
import java.util.Objects;

public class MarksKey implements Serializable {
    String sid;
    int testno;

    public MarksKey() {
        super();
    }

    public MarksKey(String sid, int testno) {
        super();
        this.sid = sid;
        this.testno = testno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarksKey marksKey = (MarksKey) o;
        return testno == marksKey.testno && sid.equals(marksKey.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, testno);
    }
}

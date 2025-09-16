package io.loop.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Bug {
    String id;
    String description;
    String status;
    String createdBy;

    public Bug(String id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdBy = createdBy;
    }

    public String toString() {
        return "\nBug: " +
                "\n\tId:          " + id +
                "\n\tDescription: " + description +
                "\n\tStatus:      " + status +
                "\n\tCreated By:  " + createdBy;
    }





}

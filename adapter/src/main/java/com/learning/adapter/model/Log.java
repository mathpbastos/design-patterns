package com.learning.adapter.model;

import java.time.LocalDateTime;

public class Log {
    private String type;
    private String info;
    private String user;
    private LocalDateTime timestamp;

    public Log(String type, String info, String user, LocalDateTime timestamp) {
        this.type = type;
        this.info = info;
        this.user = user;
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        return info;
    }

    public String getUser() {
        return user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    
}
